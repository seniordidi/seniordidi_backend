package org.seniordidi.backend.domain.converters;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import org.seniordidi.backend.domain.enums.Role;

@Converter(autoApply = true)
public class RoleConverter implements AttributeConverter<Role, Integer> {
    @Override
    public Integer convertToDatabaseColumn(Role role) {
        return role.getId();
    }

    @Override
    public Role convertToEntityAttribute(Integer id) {
        for (Role role : Role.values()) {
            if (id.equals(role.getId())) {
                return role;
            }
        }
        return null;
    }
}