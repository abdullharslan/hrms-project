package com.odev.hrms.repository;

import com.odev.hrms.model.CandidateCvTechnelogy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CandidateCvTechnelogyRepository extends JpaRepository<CandidateCvTechnelogy,Integer> {
    @Query("From CandidateCvTechnelogy t inner join t.candidate c where c.id=:candidateId")
    List<CandidateCvTechnelogy> findByCandidateId(int candidateId);
}
