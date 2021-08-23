package com.odev.hrms.repository;

import com.odev.hrms.model.CandidateCvCovverLetter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CandidateCvCovverLetterRepository extends JpaRepository<CandidateCvCovverLetter,Integer> {
    @Query("From CandidateCvCovverLetter l inner join l.candidate c where c.id=:candidateId")
    List<CandidateCvCovverLetter> findByCandidateId(int candidateId);
}
