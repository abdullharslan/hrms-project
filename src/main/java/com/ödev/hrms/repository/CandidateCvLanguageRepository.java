package com.odev.hrms.repository;

import com.odev.hrms.model.CandidateCvLanguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CandidateCvLanguageRepository extends JpaRepository<CandidateCvLanguage,Integer> {
    @Query("From CandidateCvLanguage ccl inner join ccl.candidate c where c.id=:candidateId")
    List<CandidateCvLanguage> findByCandidateId(int candidateId);
}
