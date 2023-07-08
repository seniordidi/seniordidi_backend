package org.seniordidi.backend.repository;

import org.seniordidi.backend.domain.Compensation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompensationRepository extends JpaRepository<Compensation, String> {
}
