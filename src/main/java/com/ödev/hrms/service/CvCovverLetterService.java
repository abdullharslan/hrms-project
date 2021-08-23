package com.odev.hrms.service;

import com.odev.hrms.dto.CvCovverLetterDto;
import com.odev.hrms.model.CandidateCvCovverLetter;
import com.odev.hrms.repository.CandidateCvCovverLetterRepository;
import com.odev.hrms.repository.CandidateRepository;
import com.odev.hrms.results.Result;
import com.odev.hrms.results.SuccessResult;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CvCovverLetterService {
    private final CandidateCvCovverLetterRepository candidateCvCovverLetterRepository;
    private final CandidateRepository candidateRepository;

    public Result create(CvCovverLetterDto cvCovverLetterDto){
        CandidateCvCovverLetter candidateCvCovverLetter = new CandidateCvCovverLetter();
        candidateCvCovverLetter.setCandidate(candidateRepository.findById(cvCovverLetterDto.getCandidateId()).get());
        candidateCvCovverLetter.setComment(cvCovverLetterDto.getComment());
        candidateCvCovverLetterRepository.save(candidateCvCovverLetter);
        return new SuccessResult();
    }
}
