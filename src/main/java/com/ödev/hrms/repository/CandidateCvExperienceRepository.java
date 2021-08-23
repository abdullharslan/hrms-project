package com.odev.hrms.repository;

import com.odev.hrms.model.CandidateCvExperience;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CandidateCvExperienceRepository extends JpaRepository<CandidateCvExperience,Integer> {
    @Query("From CandidateCvExperience cce inner join cce.candidate c where c.id=:candidateId")
    List<CandidateCvExperience> findByCandidateId(int candidateId);
}
