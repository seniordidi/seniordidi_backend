package org.seniordidi.backend.domain.enums;

/**
 * Enum for qualification
 */
public enum Qualification {
    BTECH("B.Tech"),
    MBA("MBA");

    String qualification;

    Qualification(String qualification) {
        this.qualification = qualification;
    }

    @Override
    public String toString() {
        return this.qualification;
    }
}
