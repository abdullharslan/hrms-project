package com.odev.hrms.service;

import com.odev.hrms.dto.EmployeeDto;
import com.odev.hrms.dto.EmployerDto;
import com.odev.hrms.model.Employee;
import com.odev.hrms.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class EmployeeService {
    private final EmployeeRepository employeeRepository;
    private final ModelMapper modelMapper;

    public EmployeeDto create(EmployeeDto employeeDto) {
        Employee employee = modelMapper.map(employeeDto,Employee.class);
        return modelMapper.map(employeeRepository.save(employee), EmployeeDto.class);
    }
    public List<EmployeeDto> getAll(){
        List<Employee> employees = employeeRepository.findAll();
        List<EmployeeDto> resultDtos = employees.
                stream().
                map(employee -> modelMapper.map(employee,EmployeeDto.class)).collect(Collectors.toList());
        return resultDtos;
    }
}
