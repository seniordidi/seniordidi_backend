package org.seniordidi.backend.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

/**
 * Jobs POJO
 */
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "job_opening")
public class Job {

    @Id
    @Column(name = "id", length = 20)
    private String id;

    @Column(name = "title", length = 50)
    private String title;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    @Column(name = "job_link", length = 100)
    private String jobLink;

    @Column(name = "role_id")
    private Integer roleId;

    @Column(name = "organisation_id")
    private Integer organisationId;

    @Column(name = "location_id")
    private Integer locationId;

    @Column(name = "category_id")
    private Integer categoryId;

    @Column(name = "job_type_id")
    private Integer jobTypeId;

    @Column(name = "min_years_of_experience")
    private Integer minYearsOfExperience;

    @Column(name = "qualification_id")
    private Integer qualificationId;

    @Column(name = "is_verified")
    private Integer isVerified;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "updated_at")
    private Timestamp updatedAt;

    @Column(name = "expiry_date")
    private Timestamp expiryDate;

//    Role role;
//    Organisation organisation;
//    Location location;
//    Category category;
//    JobType jobType;
//    Integer minYearsOfExperience;
//    Qualification qualification;
//    Compensation compensation;
//    String jobLink;
//    List<Skill> skillsRequired;
//    Boolean isVerified;
//
//    LocalDateTime createdAt;
//    LocalDateTime updatedAt;
//    LocalDateTime expiryDate;
}
