package com.odev.hrms.service;

import com.odev.hrms.dto.CandidateDto;
import com.odev.hrms.model.Candidate;
import com.odev.hrms.repository.CandidateRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CandidateService {
    private final CandidateRepository candidateRepository;
    private final ModelMapper modelMapper;
    public CandidateDto createCandidate(CandidateDto candidateDto){
        Candidate candidate = modelMapper.map(candidateDto,Candidate.class);
        return modelMapper.map(this.candidateRepository.save(candidate), CandidateDto.class);
    }

    public List<CandidateDto>  getAll(){
        List<Candidate> candidates  = candidateRepository.findAll();
        List<CandidateDto> resultDtos = candidates.
                stream().
                map(candidate -> modelMapper.map(candidate,CandidateDto.class)).collect(Collectors.toList());
        return resultDtos;
    }
    public CandidateDto getByCandidateId( int id){
        Optional<Candidate> candidate = candidateRepository.findById(id);
        if(candidate.isPresent()){
            return modelMapper.map(candidate.get(),CandidateDto.class);
        }
        return null;
    }
    public CandidateDto update( int id,CandidateDto candidateDto){
        Optional<Candidate> candidate = candidateRepository.findById(id);
        if(candidate.isPresent()){
            candidate.get().setFirstName(candidateDto.getFirstName());
            candidate.get().setLastName(candidateDto.getLastName());
            candidate.get().setBirthDate(candidateDto.getBirthDate());
            return modelMapper.map(candidateRepository.save(candidate.get()),CandidateDto.class);
        }
        return null;
    }
    public Boolean delete(int id){
        Optional<Candidate> candidate = candidateRepository.findById(id);
        if(candidate.isPresent()){
            candidateRepository.deleteById(id);
            return true;
        }
        return false;
    }

}
