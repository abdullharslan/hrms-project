package com.odev.hrms.dto;

import com.odev.hrms.model.Candidate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CvCovverLetterDto {
    private int id;
    private String comment;
    private int candidateId;
}
