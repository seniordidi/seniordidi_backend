package org.seniordidi.backend.domain.enums;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

@Getter
public enum Location {
    REMOTE(1, "Remote"),
    HYDERABAD(2, "Hyderabad"),
    BANGALORE(3, "Bangalore");

    final Integer id;
    final String location;

    Location(Integer id, String location) {
        this.id = id;
        this.location = location;
    }

    @JsonValue
    public String getValue() {
        return this.location;
    }
}
