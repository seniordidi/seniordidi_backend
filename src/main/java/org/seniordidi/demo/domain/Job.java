package org.seniordidi.demo.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Jobs POJO
 */
@Getter
@Setter
@NoArgsConstructor
public class Job {
    String id;
    String title;
    String description;
    Role role;
    Organisation organisation;
    Location location;
    Category category;
    JobType jobType;
    Integer minYearsOfExperience;
    Qualification qualification;
    Compensation compensation;
    String jobLink;
    List<Skill> skillsRequired;
    Boolean isVerified;

    LocalDateTime createdAt;
    LocalDateTime updatedAt;
    LocalDateTime expiryDate;
}
