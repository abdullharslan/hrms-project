package com.odev.hrms.service;

import com.odev.hrms.dto.ResumeDto;
import com.odev.hrms.model.Candidate;
import com.odev.hrms.repository.*;
import com.odev.hrms.results.DataResult;
import com.odev.hrms.results.Result;
import com.odev.hrms.results.SuccessDataResult;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ResumeService {
    private final CandidateCvTechnelogyRepository cvTechnelogyRepository;
    private final CandidateCvSchoolRepository cvSchoolRepository;
    private final CandidateCvLinkRepository candidateCvLinkRepository;
    private final CandidateCvLanguageRepository candidateCvLanguageRepository;
    private final CandidateCvExperienceRepository candidateCvExperienceRepository;
    private final CandidateCvCovverLetterRepository candidateCvCovverLetterRepository;
    private final CandidateRepository candidateRepository;

    public DataResult<ResumeDto>   getById(int candidateId){
        Candidate candidate = new Candidate();
        ResumeDto resumeDto = new ResumeDto();
        resumeDto.setCandidate(candidateRepository.findById(candidateId).get());
        resumeDto.setExperiences(candidateCvExperienceRepository.findByCandidateId(candidateId));
        resumeDto.setCovverLetter(candidateCvCovverLetterRepository.findByCandidateId(candidateId));
        resumeDto.setLanguages(candidateCvLanguageRepository.findByCandidateId(candidateId));
        resumeDto.setLinks(candidateCvLinkRepository.findByCandidateId(candidateId));
        resumeDto.setSchools(cvSchoolRepository.findByCandidateId(candidateId));
        resumeDto.setTechnelogies(cvTechnelogyRepository.findByCandidateId(candidateId));

        return new SuccessDataResult<>(resumeDto);
    }
}
