package com.odev.hrms.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class CVLinkDto {

    private int id;
    private String githubLink;
    private String linkedinLink;
    private int candidateId;
}
