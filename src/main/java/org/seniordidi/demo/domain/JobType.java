package org.seniordidi.demo.domain;

/**
 * Enum for Job Type
 */
public enum JobType {
    PARTTIME("Part Time"),
    Internship("Internship"),
    FULLTIME("Full Time");

    String jobType;

    JobType(String jobType) {
        this.jobType = jobType;
    }

    @Override
    public String toString() {
        return this.jobType;
    }
}
