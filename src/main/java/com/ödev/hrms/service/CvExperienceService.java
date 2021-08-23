package com.odev.hrms.service;

import com.odev.hrms.dto.CvExperienceDto;
import com.odev.hrms.model.CandidateCvExperience;
import com.odev.hrms.repository.CandidateCvExperienceRepository;
import com.odev.hrms.repository.CandidateRepository;
import com.odev.hrms.repository.JobPositionRepository;
import com.odev.hrms.results.Result;
import com.odev.hrms.results.SuccessResult;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CvExperienceService {
    private final CandidateCvExperienceRepository candidateCvExperienceRepository;
    private final CandidateRepository candidateRepository;
    private final JobPositionRepository jobPositionRepository;
    public Result create(CvExperienceDto cvExperienceDto){
        CandidateCvExperience candidateCvExperience = new CandidateCvExperience();
        candidateCvExperience.setCandidate(candidateRepository.findById(cvExperienceDto.getCandidateId()).get());
        candidateCvExperience.setJobPositions(jobPositionRepository.findById(cvExperienceDto.getJobPositionId()).get());
        candidateCvExperience.setQuitDate(cvExperienceDto.getQuitDate());
        candidateCvExperience.setStartDate(cvExperienceDto.getStartDate());
        candidateCvExperience.setWorkPlaceName(cvExperienceDto.getWorkPlaceName());
        candidateCvExperienceRepository.save(candidateCvExperience);
        return new SuccessResult();
    }
}
