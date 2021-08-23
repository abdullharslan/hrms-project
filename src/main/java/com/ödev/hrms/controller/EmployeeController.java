package com.odev.hrms.controller;

import com.odev.hrms.dto.EmployeeDto;
import com.odev.hrms.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
@RequiredArgsConstructor
public class EmployeeController {
    private final EmployeeService employeeService;
    @PostMapping("/create")
    public ResponseEntity<EmployeeDto> create(@RequestBody EmployeeDto employeeDto){
        return ResponseEntity.ok(employeeService.create(employeeDto));
    }
    @GetMapping("/getAll")
    public ResponseEntity<List<EmployeeDto>> getAll(){
        return ResponseEntity.ok(employeeService.getAll());
    }
}
