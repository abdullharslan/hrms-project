package com.odev.hrms.service;

import com.odev.hrms.dto.CvSchoolDto;
import com.odev.hrms.model.CandidateCvSchool;
import com.odev.hrms.repository.CandidateCvSchoolRepository;
import com.odev.hrms.repository.CandidateRepository;
import com.odev.hrms.repository.SchoolRepository;
import com.odev.hrms.results.Result;
import com.odev.hrms.results.SuccessResult;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CvSchoolService {
    private final CandidateCvSchoolRepository cvSchoolRepository;
    private final SchoolRepository schoolRepository;
    private final CandidateRepository candidateRepository;
    public Result create(CvSchoolDto cvSchoolDto){
        CandidateCvSchool candidateCvSchool = new CandidateCvSchool();
        candidateCvSchool.setSchool(schoolRepository.getById(cvSchoolDto.getSchoolId()));
        candidateCvSchool.setCandidate(candidateRepository.getById(cvSchoolDto.getCandidateId()));
        candidateCvSchool.setSchoolDepartment(cvSchoolDto.getSchoolDepartment());
        candidateCvSchool.setStartDate(cvSchoolDto.getStartDate());
        candidateCvSchool.setGradiationDate(cvSchoolDto.getGradiationDate());
        cvSchoolRepository.save(candidateCvSchool);
        return new SuccessResult();
    }

}
