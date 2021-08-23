package com.odev.hrms.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CvLanguageDto {
    private int languageLevel;
    private String name;
    private int candidateId;
}
