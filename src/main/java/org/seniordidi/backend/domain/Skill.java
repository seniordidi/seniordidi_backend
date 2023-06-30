package org.seniordidi.backend.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.seniordidi.backend.domain.enums.Category;

/**
 * POJO for Skills
 */

@Getter
@Setter
@NoArgsConstructor
public class Skill {
    String title;

    // category to which this skill belongs
    Category category;

    public Skill(String title, Category category){
        this.title = title;
        this.category = category;
    }
}
