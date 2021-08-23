package com.odev.hrms.repository;

import com.odev.hrms.model.WorkingTime;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkingTimeRepository extends JpaRepository<WorkingTime,Integer> {
}
