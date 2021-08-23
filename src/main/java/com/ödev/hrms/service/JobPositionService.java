package com.odev.hrms.service;

import com.odev.hrms.dto.JobPositionDto;
import com.odev.hrms.model.JobPosition;
import com.odev.hrms.repository.JobPositionRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class JobPositionService {
    private final JobPositionRepository jobPositionRepository;
    private final ModelMapper modelMapper;

    public JobPositionDto create(JobPositionDto jobPositionDto){
        JobPosition jobPosition = modelMapper.map(jobPositionDto,JobPosition.class);
        return modelMapper.map(jobPositionRepository.save(jobPosition),JobPositionDto.class);
    }
    public List<JobPositionDto> getAll(){
        List<JobPosition> jobPositions = jobPositionRepository.findAll();
        List<JobPositionDto> resultDtos = jobPositions.
                stream().
                map(jobPosition -> modelMapper.map(jobPosition,JobPositionDto.class)).collect(Collectors.toList());
        return resultDtos;
    }
}
