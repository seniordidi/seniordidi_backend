package org.seniordidi.backend.domain;

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
public class Compensation {
    Integer minimumCompensation;
    Integer maximumCompensation;
    CompensationType compensationType;
}
