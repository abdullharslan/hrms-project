package com.odev.hrms.controller;

import com.odev.hrms.dto.CvExperienceDto;
import com.odev.hrms.results.Result;
import com.odev.hrms.service.CvExperienceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cvExperience")
@RequiredArgsConstructor
public class CvExperienceController {

    private final CvExperienceService cvExperienceService;

    @PostMapping("/create")
    public ResponseEntity<Result> create (@RequestBody CvExperienceDto cvExperienceDto){
        return ResponseEntity.ok(cvExperienceService.create(cvExperienceDto));
    }
}
