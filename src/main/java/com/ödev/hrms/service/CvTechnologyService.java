package com.odev.hrms.service;

import com.odev.hrms.dto.CvTechnologyDto;
import com.odev.hrms.model.CandidateCvTechnelogy;
import com.odev.hrms.repository.CandidateCvTechnelogyRepository;
import com.odev.hrms.repository.CandidateRepository;
import com.odev.hrms.results.Result;
import com.odev.hrms.results.SuccessResult;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CvTechnologyService {
    private final CandidateCvTechnelogyRepository cvTechnelogyRepository;
    private final ModelMapper modelMapper;
    private final CandidateRepository candidateRepository;

    public Result create(CvTechnologyDto cvTechnologyDto) {
        CandidateCvTechnelogy candidateCvTechnelogy = new CandidateCvTechnelogy();
        candidateCvTechnelogy.setCandidate(candidateRepository.findById(cvTechnologyDto.getCandidateId()).get());
        candidateCvTechnelogy.setUsedTechnology(cvTechnologyDto.getUsedTechnology());
        return new SuccessResult();
    }
//    public CvTechnologyDto create2(CvTechnologyDto cvTechnologyDto) {
//        CandidateCvTechnelogy candidateCvTechnelogy = modelMapper.map(cvTechnologyDto,CandidateCvTechnelogy.class);
//        candidateCvTechnelogy.setCandidate(candidateRepository.findById(cvTechnologyDto.getCandidateId()).get());
//        return modelMapper.map(candidateCvTechnelogy,CvTechnologyDto.class) ;
//    }

    public Boolean delete(int id){
        Optional<CandidateCvTechnelogy> candidateCvTechnelogy = cvTechnelogyRepository.findById(id);
        if(candidateCvTechnelogy.isPresent()){
            cvTechnelogyRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
