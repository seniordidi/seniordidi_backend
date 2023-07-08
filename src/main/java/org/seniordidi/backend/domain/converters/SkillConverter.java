package org.seniordidi.backend.domain.converters;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import org.seniordidi.backend.domain.enums.Skill;

@Converter(autoApply = true)
public class SkillConverter implements AttributeConverter<Skill, Integer> {
    @Override
    public Integer convertToDatabaseColumn(Skill skill) {
        return skill.getId();
    }

    @Override
    public Skill convertToEntityAttribute(Integer id) {
        for (Skill skill : Skill.values()) {
            if (id.equals(skill.getId())) {
                return skill;
            }
        }
        return null;
    }
}
