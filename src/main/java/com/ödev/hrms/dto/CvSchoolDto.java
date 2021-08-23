package com.odev.hrms.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CvSchoolDto {
    private int id;
    private LocalDate startDate;
    private LocalDate gradiationDate;
    private String schoolDepartment;
    private int candidateId;
    private int schoolId;
}
