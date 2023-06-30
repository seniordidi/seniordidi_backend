package org.seniordidi.backend.service;

import org.seniordidi.backend.domain.Job;
import org.seniordidi.backend.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobServiceImpl implements JobService {

    @Autowired
    JobRepository jobRepository;
    @Override
    public void createJob(Job job) {
        jobRepository.save(job);
        System.out.println("Job Added Successfully");
    }
}
