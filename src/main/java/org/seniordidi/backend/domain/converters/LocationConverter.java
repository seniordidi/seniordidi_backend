package org.seniordidi.backend.domain.converters;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import org.seniordidi.backend.domain.enums.Location;

@Converter(autoApply = true)
public class LocationConverter implements AttributeConverter<Location, Integer> {
    @Override
    public Integer convertToDatabaseColumn(Location location) {
        return location.getId();
    }

    @Override
    public Location convertToEntityAttribute(Integer id) {
        for (Location location : Location.values()) {
            if (id.equals(location.getId())) {
                return location;
            }
        }
        return null;
    }
}
