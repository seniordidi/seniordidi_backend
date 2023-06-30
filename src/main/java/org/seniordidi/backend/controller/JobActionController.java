package org.seniordidi.backend.controller;

import org.seniordidi.backend.domain.*;
import org.seniordidi.backend.domain.enums.*;
import org.seniordidi.backend.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Class contains the API Endpoints for JOB related APIs
 */
@RestController
@RequestMapping(value = "/job")
public class JobActionController {

    @Autowired
    JobService jobService;

//    @RequestMapping(method = RequestMethod.GET,
//            value = "/all",
//            produces = MediaType.APPLICATION_JSON_VALUE)
//    public List<Job> fetchAllJobs(){
//        List<Job> list = new ArrayList<>();
//        Job e = new Job();
//        e.setId("1");
//        e.setTitle("Associate Quality Analyst Engineer");
//        e.setDescription("Zoho is looking for a fresher/ recently graduated, for the role AQAE in their AdTech team.");
//        e.setRole(Role.QA);
//        e.setOrganisation(new Organisation("Zoho"));
//        e.setLocation(Location.REMOTE);
//        e.setCategory(Category.SOFTWARE);
//        e.setJobType(JobType.FULLTIME);
//        e.setQualification(Qualification.BTECH);
//        e.setMinYearsOfExperience(1);
//
//        Compensation compensation = new Compensation();
//        compensation.setMinimumCompensation(1000000);
//        compensation.setMaximumCompensation(2000000);
//        compensation.setCompensationType(CompensationType.CTC);
//
//        e.setCompensation(compensation);
//        e.setJobLink("https://www.zoho.com");
//
//        List<Skill> skills = new ArrayList<>();
//        skills.add(new Skill("Java",Category.SOFTWARE));
//        skills.add(new Skill("Pytest",Category.SOFTWARE));
//
//        e.setSkillsRequired(skills);
//        e.setCreatedAt(LocalDateTime.now());
//        e.setUpdatedAt(LocalDateTime.now());
//        e.setExpiryDate(LocalDateTime.of(2023,7,31,0,0));
//
//        list.add(e);
//        return list;
//    }

    @RequestMapping(method = RequestMethod.POST,
    value = "/",
    consumes = MediaType.APPLICATION_JSON_VALUE,
    produces = MediaType.APPLICATION_JSON_VALUE)
    public void createJob(@RequestBody Job job){
        jobService.createJob(job);
    }
}
