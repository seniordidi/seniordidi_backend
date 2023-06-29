package org.seniordidi.demo.domain;

/**
 * Enum for Category
 */
public enum Category {
    SOFTWARE("Software"),
    MARKETING("Marketing");

    String category;

    Category(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return this.category;
    }
}
