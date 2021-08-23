package com.odev.hrms.dto;

import com.odev.hrms.model.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResumeDto {
    private List<CandidateCvExperience> experiences;
    private List<CandidateCvLanguage> languages;
    private List<CandidateCvLink> links;
    private List<CandidateCvSchool> schools;
    private List<CandidateCvTechnelogy> technelogies;
    private List<CandidateCvCovverLetter> covverLetter;
    private Candidate candidate;
}
