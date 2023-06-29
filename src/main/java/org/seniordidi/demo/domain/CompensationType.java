package org.seniordidi.demo.domain;

/**
 * Enum for Compensation Type
 */
public enum CompensationType {
    STIPEND("Stipend"),
    CTC("CTC");

    String compensationType;

    CompensationType(String compensationType) {
        this.compensationType = compensationType;
    }

    @Override
    public String toString() {
        return this.compensationType;
    }
}
