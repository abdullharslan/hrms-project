package com.odev.hrms.repository;

import com.odev.hrms.model.JobPosition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobPositionRepository extends JpaRepository<JobPosition,Integer> {
}
