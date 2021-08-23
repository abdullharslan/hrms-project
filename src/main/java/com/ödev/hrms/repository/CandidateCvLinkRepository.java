package com.odev.hrms.repository;

import com.odev.hrms.model.CandidateCvLink;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CandidateCvLinkRepository extends JpaRepository<CandidateCvLink,Integer> {
    @Query("From CandidateCvLink ccli inner join ccli.candidate c where c.id=:candidateId")
    List<CandidateCvLink> findByCandidateId(int candidateId);
}
