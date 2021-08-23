package com.odev.hrms.controller;

import com.odev.hrms.dto.CVLinkDto;
import com.odev.hrms.results.Result;
import com.odev.hrms.service.CvLinkService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cvLink")
@RequiredArgsConstructor
public class CvLinkController {
    private final CvLinkService cvLinkService;

    @PostMapping("/create")
    public ResponseEntity<Result> create(@RequestBody CVLinkDto cvLinkDto){
        return ResponseEntity.ok(cvLinkService.create(cvLinkDto));
    }
}
