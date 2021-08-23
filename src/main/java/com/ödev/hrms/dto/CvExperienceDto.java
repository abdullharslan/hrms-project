package com.odev.hrms.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CvExperienceDto {
    private int id;
    private String workPlaceName;
    private LocalDate startDate;
    private LocalDate quitDate;
    private int candidateId;
    private int jobPositionId;
}
