package org.seniordidi.backend.domain.enums;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

/**
 * Enum for Compensation Type
 */
@Getter
public enum CompensationType {
    STIPEND(1, "Stipend"),
    CTC(2, "CTC");

    final Integer id;
    final String compensationType;

    CompensationType(Integer id, String compensationType) {
        this.id = id;
        this.compensationType = compensationType;
    }

    @JsonValue
    public String getValue() {
        return this.compensationType;
    }
}
