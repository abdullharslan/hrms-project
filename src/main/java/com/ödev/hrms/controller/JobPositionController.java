package com.odev.hrms.controller;

import com.odev.hrms.dto.JobPositionDto;
import com.odev.hrms.service.JobPositionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jobposition")
@RequiredArgsConstructor
public class JobPositionController {
    private final JobPositionService jobPositionService;

    @PostMapping("/create")
    public ResponseEntity<JobPositionDto>  create(@RequestBody JobPositionDto jobPositionDto){
        return ResponseEntity.ok(jobPositionService.create(jobPositionDto));
    }
    @GetMapping("/getAll")
    public ResponseEntity<List<JobPositionDto>> getAll(){
        return ResponseEntity.ok(jobPositionService.getAll());
    }
}
