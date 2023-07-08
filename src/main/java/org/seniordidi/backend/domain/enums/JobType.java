package org.seniordidi.backend.domain.enums;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

/**
 * Enum for Job Type
 */

@Getter
public enum JobType {
    PARTTIME(1, "Part Time"),
    Internship(2, "Internship"),
    FULLTIME(3, "Full Time");

    final Integer id;
    final String jobType;

    JobType(Integer id, String jobType) {
        this.id = id;
        this.jobType = jobType;
    }

    @JsonValue
    public String getValue() {
        return this.getJobType();
    }
}
