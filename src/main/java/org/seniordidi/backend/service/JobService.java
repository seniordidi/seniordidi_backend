package org.seniordidi.backend.service;

import org.seniordidi.backend.domain.Job;
import org.springframework.transaction.annotation.Transactional;

public interface JobService {

    @Transactional
    public Job createJob(Job job) throws Exception;
}
