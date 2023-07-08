package org.seniordidi.backend.domain.enums;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

/**
 * Enum for Category
 */

@Getter
public enum Category {
    SOFTWARE(1, "Software"),
    MARKETING(2, "Marketing");

    final Integer id;
    final String category;

    Category(Integer id, String category) {
        this.id = id;
        this.category = category;
    }

    @JsonValue
    public String getValue() {
        return this.getCategory();
    }
}
