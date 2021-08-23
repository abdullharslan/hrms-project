package com.odev.hrms.controller;

import com.odev.hrms.dto.ResumeDto;
import com.odev.hrms.results.DataResult;
import com.odev.hrms.service.ResumeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/resume")
@RequiredArgsConstructor
public class ResumeController {
    private final ResumeService resumeService;

    @GetMapping("/getById")
    public ResponseEntity<DataResult<ResumeDto>> getById(@RequestParam int candidateId){
        return ResponseEntity.ok(resumeService.getById(candidateId));
    }
}
