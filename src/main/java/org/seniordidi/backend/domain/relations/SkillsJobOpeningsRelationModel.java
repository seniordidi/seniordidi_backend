package org.seniordidi.backend.domain.relations;

import jakarta.persistence.*;
import lombok.*;
import org.seniordidi.backend.domain.enums.Skill;

import java.io.Serializable;

@Data
@NoArgsConstructor
@Entity
@Table(name = "skills_job_openings")
//@IdClass(SkillsJobOpeningsRelationModel.SkillsJobOpeningsRelationModelId.class)
public class SkillsJobOpeningsRelationModel {

    @EmbeddedId
    SkillsJobOpeningsRelationModelEmbeddedId skillsJobOpeningsRelationModelEmbeddedId;

    public SkillsJobOpeningsRelationModel(String jobOpeningId, Skill skill) {
        this.skillsJobOpeningsRelationModelEmbeddedId = new SkillsJobOpeningsRelationModelEmbeddedId(jobOpeningId, skill);
    }

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @Embeddable
    public static class SkillsJobOpeningsRelationModelEmbeddedId implements Serializable {
        @Column(name = "job_opening_id", length = 100)
        String jobOpeningId;

        //    @Id
        @Column(name = "skill_id", length = 100)
        Skill skill;
    }

}
