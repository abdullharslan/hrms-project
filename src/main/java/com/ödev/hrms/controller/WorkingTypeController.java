package com.odev.hrms.controller;

import com.odev.hrms.dto.WorkingTypeDto;
import com.odev.hrms.service.WorkingTypeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/workingtype")
@RequiredArgsConstructor
public class WorkingTypeController {
    private final WorkingTypeService workingTypeService;
    @PostMapping("/create")
    public ResponseEntity<WorkingTypeDto>  create(@RequestBody WorkingTypeDto workingTypeDto){
        return ResponseEntity.ok(workingTypeService.create(workingTypeDto));
    }
}
