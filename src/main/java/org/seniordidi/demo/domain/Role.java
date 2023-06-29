package org.seniordidi.demo.domain;

/**
 * Enum for Role
 */
public enum Role {
    QA("Quality Testing"),
    SDE("Software Developer");

    String role;

    Role(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return this.role;
    }
}
