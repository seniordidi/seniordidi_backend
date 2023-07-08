package org.seniordidi.backend.repository;

import org.seniordidi.backend.domain.relations.SkillsJobOpeningsRelationModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillsJobOpeningsRelationRepository extends JpaRepository<SkillsJobOpeningsRelationModel, String> {
}
