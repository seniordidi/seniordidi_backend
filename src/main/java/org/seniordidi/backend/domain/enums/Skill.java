package org.seniordidi.backend.domain.enums;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.seniordidi.backend.domain.enums.Category;

/**
 * POJO for Skills
 */

@Getter
public enum Skill {

    JAVA(1, "Java", Category.SOFTWARE);

    final Integer id;
    final String title;

    // category to which this skill belongs
    final Category category;

    Skill(Integer id, String title, Category category) {
        this.id = id;
        this.title = title;
        this.category = category;
    }

    @JsonValue
    public String getValue() {
        return this.getTitle();
    }
}
