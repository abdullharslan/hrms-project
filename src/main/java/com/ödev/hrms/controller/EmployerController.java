package com.odev.hrms.controller;

import com.odev.hrms.dto.EmployerDto;
import com.odev.hrms.service.EmployerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employer")
@RequiredArgsConstructor
public class EmployerController {
    private final EmployerService employerService;
    @PostMapping("/create")
    public ResponseEntity<EmployerDto>  create( @RequestBody EmployerDto employerDto){
        return ResponseEntity.ok(employerService.create(employerDto));
    }
    @GetMapping("/getAll")
    public ResponseEntity<List<EmployerDto> > getAll(){
        return ResponseEntity.ok(employerService.getAll());
    }
}
