package com.odev.hrms.service;

import com.odev.hrms.dto.WorkingTimeDto;
import com.odev.hrms.model.WorkingTime;
import com.odev.hrms.repository.WorkingTimeRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WorkingTimeService {
    private final WorkingTimeRepository workingTimeRepository;
    private final ModelMapper modelMapper;

    public WorkingTimeDto create(WorkingTimeDto workingTimeDto) {
        WorkingTime workingTime = modelMapper.map(workingTimeDto,WorkingTime.class);
        return modelMapper.map(workingTimeRepository.save(workingTime) ,WorkingTimeDto.class);
    }
}
