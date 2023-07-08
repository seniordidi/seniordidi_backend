package org.seniordidi.backend.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.seniordidi.backend.domain.enums.CompensationType;

/**
 * POJO for Compensation
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "compensation")
public class Compensation {

    @Id
    @Column(name = "id")
    String id;

    @Column(name = "job_opening_id")
    String jobOpeningId;

    @Column(name = "minimum_compensation")
    Integer minimumCompensation;

    @Column(name = "maximum_compensation")
    Integer maximumCompensation;

    @Column(name = "compensation_type_id")
    CompensationType compensationType;
}
