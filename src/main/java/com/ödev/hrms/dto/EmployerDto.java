package com.odev.hrms.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployerDto {
    private int id;
    private String firstName;
    private String lastName;
    private String companyName;
}
