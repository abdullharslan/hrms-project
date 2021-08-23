package com.odev.hrms.service;

import com.odev.hrms.dto.CvLanguageDto;
import com.odev.hrms.model.CandidateCvLanguage;
import com.odev.hrms.repository.CandidateCvLanguageRepository;
import com.odev.hrms.repository.CandidateRepository;
import com.odev.hrms.results.Result;
import com.odev.hrms.results.SuccessResult;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CvLanguageService {
    private final CandidateCvLanguageRepository candidateCvLanguageRepository;
    private final CandidateRepository candidateRepository;

    public Result create(CvLanguageDto cvLanguageDto){
        CandidateCvLanguage candidateCvLanguage = new CandidateCvLanguage();
        candidateCvLanguage.setCandidate(candidateRepository.findById(cvLanguageDto.getCandidateId()).get());
        candidateCvLanguage.setLanguageLevel(cvLanguageDto.getLanguageLevel());
        candidateCvLanguage.setName(cvLanguageDto.getName());
        candidateCvLanguageRepository.save(candidateCvLanguage);
        return new SuccessResult();
    }
}
