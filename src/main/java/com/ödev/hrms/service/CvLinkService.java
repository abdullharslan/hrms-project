package com.odev.hrms.service;

import com.odev.hrms.dto.CVLinkDto;
import com.odev.hrms.model.Candidate;
import com.odev.hrms.model.CandidateCvLink;
import com.odev.hrms.repository.CandidateCvLinkRepository;
import com.odev.hrms.repository.CandidateRepository;
import com.odev.hrms.results.Result;
import com.odev.hrms.results.SuccessResult;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CvLinkService {
    private final CandidateCvLinkRepository candidateCvLinkRepository;
    private final CandidateRepository candidateRepository;

    public Result create(CVLinkDto cvLinkDto){
        CandidateCvLink candidateCvLink = new CandidateCvLink();
        candidateCvLink.setCandidate(candidateRepository.findById(cvLinkDto.getCandidateId()).get());
        candidateCvLink.setLinkedinLink(cvLinkDto.getLinkedinLink());
        candidateCvLink.setGithubLink(cvLinkDto.getGithubLink());
        candidateCvLinkRepository.save(candidateCvLink);
        return new SuccessResult();
    }
}
