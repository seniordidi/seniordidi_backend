package org.seniordidi.backend.service;

import org.seniordidi.backend.domain.Compensation;
import org.seniordidi.backend.domain.Job;
import org.seniordidi.backend.domain.relations.SkillsJobOpeningsRelationModel;
import org.seniordidi.backend.repository.CompensationRepository;
import org.seniordidi.backend.repository.JobRepository;
import org.seniordidi.backend.repository.SkillsJobOpeningsRelationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Service
public class JobServiceImpl implements JobService {

    @Autowired
    JobRepository jobRepository;

    @Autowired
    SkillsJobOpeningsRelationRepository skillsJobOpeningsRelationRepository;

    @Autowired
    CompensationRepository compensationRepository;

    @Override
    @Transactional
    public Job createJob(Job job) throws Exception {

        // TODO: validate job openings POJO

        // generating random uuid for this job
        job.setId(UUID.randomUUID().toString());
        job.setCreatedAt(Timestamp.from(Instant.now()));
        job.setUpdatedAt(Timestamp.from(Instant.now()));

        // saving this job
        saveJob(job);

        // saving the skills associated with this job
        List<Exception> exceptionList = new ArrayList<>();
        if (!CollectionUtils.isEmpty(job.getSkills())) {
            job.getSkills().stream()
                    .filter(Objects::nonNull)
                    .forEach(skill -> {
                        try {
                            SkillsJobOpeningsRelationModel skillsJobOpeningsRelationModel = new SkillsJobOpeningsRelationModel(job.getId(), skill);
                            saveSkillJobOpeningRelation(skillsJobOpeningsRelationModel);
                        } catch (Exception e) {
                            exceptionList.add(e);
                        }
                    });
        }

        if (!CollectionUtils.isEmpty(exceptionList)) {
            throw exceptionList.get(0);
        }

        // setting ids for compensation
        job.getCompensation().setJobOpeningId(job.getId());
        job.getCompensation().setId(UUID.randomUUID().toString());

        // saving compensation
        saveCompensation(job.getCompensation());

        // successfully added job
        return job;
    }

    private void saveJob(Job job) throws Exception {
        Job result = jobRepository.save(job);
    }

    private void saveSkillJobOpeningRelation(SkillsJobOpeningsRelationModel skillsJobOpeningsRelationModel) throws Exception {
        skillsJobOpeningsRelationRepository.save(skillsJobOpeningsRelationModel);
    }

    private void saveCompensation(Compensation compensation) throws Exception {
        compensationRepository.save(compensation);
    }
}
