package org.seniordidi.backend.domain.converters;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import org.seniordidi.backend.domain.enums.Qualification;

@Converter(autoApply = true)
public class QualificationConverter implements AttributeConverter<Qualification, Integer> {
    @Override
    public Integer convertToDatabaseColumn(Qualification qualification) {
        return qualification.getId();
    }

    @Override
    public Qualification convertToEntityAttribute(Integer id) {
        for (Qualification qualification : Qualification.values()) {
            if (id.equals(qualification.getId())) {
                return qualification;
            }
        }
        return null;
    }
}
