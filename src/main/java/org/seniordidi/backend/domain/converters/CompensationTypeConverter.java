package org.seniordidi.backend.domain.converters;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import org.seniordidi.backend.domain.enums.CompensationType;
import org.seniordidi.backend.domain.enums.CompensationType;

@Converter(autoApply = true)
public class CompensationTypeConverter implements AttributeConverter<CompensationType, Integer> {
    @Override
    public Integer convertToDatabaseColumn(CompensationType compensationType) {
        return compensationType.getId();
    }

    @Override
    public CompensationType convertToEntityAttribute(Integer id) {
        for (CompensationType compensationType : CompensationType.values()) {
            if (id.equals(compensationType.getId())) {
                return compensationType;
            }
        }
        return null;
    }
}
