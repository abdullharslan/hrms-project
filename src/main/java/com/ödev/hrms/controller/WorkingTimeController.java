package com.odev.hrms.controller;

import com.odev.hrms.dto.WorkingTimeDto;
import com.odev.hrms.service.WorkingTimeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/workingtime")
@RequiredArgsConstructor
public class WorkingTimeController {
    private final WorkingTimeService workingTimeService;
    @PostMapping("/create")
    public ResponseEntity<WorkingTimeDto> create(@RequestBody WorkingTimeDto workingTimeDto){
        return ResponseEntity.ok(workingTimeService.create(workingTimeDto));
    }
}
