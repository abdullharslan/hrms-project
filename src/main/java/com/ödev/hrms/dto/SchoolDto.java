package com.odev.hrms.dto;

import com.odev.hrms.model.SchoolType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SchoolDto {
    private int id;
    private String name;
    private String schoolWebsite;
    private  SchoolType schoolType;
}
