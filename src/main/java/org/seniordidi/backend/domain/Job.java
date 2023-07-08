package org.seniordidi.backend.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.seniordidi.backend.domain.enums.*;

import java.sql.Timestamp;
import java.util.List;

/**
 * Jobs POJO
 */
@Getter
@Setter
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "job_opening")
public class Job {

    @Id
    @Column(name = "id", length = 100)
    private String id;

    @Column(name = "title", length = 100)
    private String title;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    @Column(name = "job_link", length = 100)
    private String jobLink;

    @Column(name = "role_id")
    private Role role;

    @Column(name = "organisation_id")
    private Integer organisationId;

    @Column(name = "location_id")
    private Location location;

    @Column(name = "category_id")
    private Category category;

    @Column(name = "job_type_id")
    private JobType jobType;

    @Column(name = "min_years_of_experience")
    private Integer minYearsOfExperience;

    @Column(name = "qualification_id")
    private Qualification qualification;

    @Column(name = "expiry_date")
    private Timestamp expiryDate;

    @Column(name = "is_verified")
    private Integer isVerified;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "updated_at")
    private Timestamp updatedAt;

    @Transient
    List<Skill> skills;

    @Transient
    Compensation compensation;
}
