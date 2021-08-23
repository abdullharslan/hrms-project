package com.odev.hrms.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class CvTechnologyDto {
    private int id;
    private String usedTechnology;
    private int candidateId;
}
