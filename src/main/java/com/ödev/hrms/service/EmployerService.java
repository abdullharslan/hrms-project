package com.odev.hrms.service;

import com.odev.hrms.dto.EmployerDto;
import com.odev.hrms.model.Employer;
import com.odev.hrms.repository.EmployerRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class EmployerService {
    private final EmployerRepository employerRepository;
    private final ModelMapper modelMapper;

    public EmployerDto create(EmployerDto employerDto){
        Employer employer = modelMapper.map(employerDto,Employer.class);
        return modelMapper.map(employerRepository.save(employer),EmployerDto.class);
    }
    public List<EmployerDto>  getAll(){
        List<Employer> employers = employerRepository.findAll();
        List<EmployerDto> resultDtos = employers.
                stream().
                map(employer -> modelMapper.map(employer,EmployerDto.class)).collect(Collectors.toList());
        return resultDtos;
    }
}
