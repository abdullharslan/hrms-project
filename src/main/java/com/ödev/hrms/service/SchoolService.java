package com.odev.hrms.service;

import com.odev.hrms.dto.SchoolDto;
import com.odev.hrms.exception.IdNotFoundException;
import com.odev.hrms.model.School;
import com.odev.hrms.model.SchoolType;
import com.odev.hrms.repository.SchoolRepository;
import com.odev.hrms.repository.SchoolTypeRepository;
import javassist.NotFoundException;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SchoolService {
    private final SchoolRepository schoolRepository;
    private final ModelMapper modelMapper;
    private final SchoolTypeRepository schoolTypeRepository;

    public SchoolDto create(SchoolDto schoolDto){
        School school = modelMapper.map(schoolDto,School.class);
//        school.setSchoolType(schoolTypeRepository.findById(schoolDto.getSchoolType()).get());
        return modelMapper.map(schoolRepository.save(school),SchoolDto.class);

    }
    public List<SchoolDto> getAll(){
        List<School> schools = schoolRepository.findAll();
        List<SchoolDto> resultDtos = schools.
                stream().
                map(school -> modelMapper.map(school,SchoolDto.class)).collect(Collectors.toList());
        return resultDtos;
    }
    public SchoolDto getById(int id){
        Optional<School> school = Optional.of(schoolRepository.getById(id));
        if(school.isPresent()){
            return modelMapper.map(school.get(),SchoolDto.class);
        }
        return null;
    }
    public SchoolDto update(int id,SchoolDto schoolDto){
        Optional<School> school = Optional.of(schoolRepository.getById(id));
        if(school.isPresent()){
            school.get().setName(schoolDto.getName());
            school.get().setSchoolWebsite(schoolDto.getSchoolWebsite());
            return modelMapper.map(schoolRepository.save(school.get()),SchoolDto.class);
        }
        return null;
    }
    public Boolean delete(int id){
        Optional<School> school = Optional.of(schoolRepository.getById(id));
        if(school.isPresent()){
            schoolRepository.deleteById(id);
            return true;
        }else{

            throw new IdNotFoundException("Id Not Found Exception");
        }

    }

}
