package org.seniordidi.demo.domain;

public enum Location {
    REMOTE("Remote"),
    HYDERABAD("Hyderabad"),
    BANGALORE("Bangalore");

    String location;

    Location(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return this.location;
    }
}
