package org.seniordidi.backend.domain.enums;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

/**
 * Enum for qualification
 */

@Getter
public enum Qualification {
    BTECH(1, "B.Tech"),
    MBA(2, "MBA");

    final Integer id;
    final String qualification;

    Qualification(Integer id, String qualification) {
        this.id = id;
        this.qualification = qualification;
    }

    @JsonValue
    public String getValue() {
        return this.getQualification();
    }
}
