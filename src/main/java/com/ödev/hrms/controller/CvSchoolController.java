package com.odev.hrms.controller;

import com.odev.hrms.dto.CvSchoolDto;
import com.odev.hrms.results.Result;
import com.odev.hrms.service.CvSchoolService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cvSchool")
@RequiredArgsConstructor
public class CvSchoolController {
    private final CvSchoolService cvSchoolService;

    @PostMapping("/create")
    public Result create(@RequestBody CvSchoolDto cvSchoolDto){
        return cvSchoolService.create(cvSchoolDto);
    }

}
