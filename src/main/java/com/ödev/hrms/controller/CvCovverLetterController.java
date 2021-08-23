package com.odev.hrms.controller;

import com.odev.hrms.dto.CvCovverLetterDto;
import com.odev.hrms.results.Result;
import com.odev.hrms.service.CvCovverLetterService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cvCovverLetter")
@RequiredArgsConstructor
public class CvCovverLetterController {
    private final CvCovverLetterService cvCovverLetterService;

    @PostMapping("/create")
    public ResponseEntity<Result> create(@RequestBody CvCovverLetterDto cvCovverLetterDto){
        return ResponseEntity.ok(cvCovverLetterService.create(cvCovverLetterDto));
    }
}
