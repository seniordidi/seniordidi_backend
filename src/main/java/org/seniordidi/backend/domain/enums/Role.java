package org.seniordidi.backend.domain.enums;


import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

/**
 * Enum for Role
 */

@Getter
public enum Role {
    QA(1, "Quality Testing"),
    SDE(2, "Software Developer");

    final Integer id;
    final String role;

    Role(Integer id, String role) {
        this.id = id;
        this.role = role;
    }

    @JsonValue
    public String getValue(){
        return getRole();
    }

}
