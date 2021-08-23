package com.odev.hrms.repository;

import com.odev.hrms.model.CandidateCvSchool;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CandidateCvSchoolRepository extends JpaRepository<CandidateCvSchool,Integer> {
    @Query("From CandidateCvSchool s inner join s.candidate c where c.id=:candidateId")
    List<CandidateCvSchool> findByCandidateId(int candidateId);
}
