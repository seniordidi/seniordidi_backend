package org.seniordidi.backend.domain;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * POJO for Organisation
 */
@Getter
@Setter
public class Organisation {
    String name;
    LocalDateTime createdAt;
    LocalDateTime updatedAt;

    public Organisation(String name){
        this.name = name;
        this.createdAt = LocalDateTime.now();
    }
}
