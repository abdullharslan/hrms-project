package com.odev.hrms.service;

import com.odev.hrms.dto.WorkingTypeDto;
import com.odev.hrms.model.WorkingType;
import com.odev.hrms.repository.WorkingTypeRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WorkingTypeService {
    private final ModelMapper modelMapper;
    private final WorkingTypeRepository workingTypeRepository;

    public WorkingTypeDto create(WorkingTypeDto workingTypeDto){
        WorkingType workingType = modelMapper.map(workingTypeDto,WorkingType.class);
        return modelMapper.map(workingTypeRepository.save(workingType),WorkingTypeDto.class);
    }
}
