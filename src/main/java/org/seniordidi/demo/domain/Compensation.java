package org.seniordidi.demo.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
