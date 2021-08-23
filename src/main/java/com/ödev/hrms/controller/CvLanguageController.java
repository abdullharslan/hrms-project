package com.odev.hrms.controller;

import com.odev.hrms.dto.CvLanguageDto;
import com.odev.hrms.results.Result;
import com.odev.hrms.service.CvLanguageService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cvLanguage")
@RequiredArgsConstructor
public class CvLanguageController {
    private final CvLanguageService cvLanguageService;

    @PostMapping("/create")
    public ResponseEntity<Result> create(@RequestBody CvLanguageDto cvLanguageDto){
        return ResponseEntity.ok(cvLanguageService.create(cvLanguageDto));
    }
}
