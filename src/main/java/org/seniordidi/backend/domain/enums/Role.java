package org.seniordidi.backend.domain.enums;

import org.springframework.core.convert.converter.Converter;

/**
 * Enum for Role
 */
public enum Role implements Converter<Role,Integer> {
    QA(1,"Quality Testing"),
    SDE(2,"Software Developer");

    final Integer id;
    final String role;

    Role(Integer id, String role) {
        this.id = id;
        this.role = role;
    }

    @Override
    public Integer convert(Role role) {
        return this.id;
    }
}
