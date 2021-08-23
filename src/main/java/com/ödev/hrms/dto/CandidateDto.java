package com.odev.hrms.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class CandidateDto {
    private int id;
    private String firstName;
    private String lastName;
    private String identityNumber;
    private Date birthDate;
}
