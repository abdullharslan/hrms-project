package com.odev.hrms.controller;

import com.odev.hrms.dto.CvTechnologyDto;
import com.odev.hrms.results.Result;
import com.odev.hrms.service.CvTechnologyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/technology")
@RequiredArgsConstructor
public class CvTechnologyController {
    private final CvTechnologyService cvTechnologyService;

    @PostMapping("/create")
    public Result create( @RequestBody CvTechnologyDto cvTechnologyDto) {
        return cvTechnologyService.create(cvTechnologyDto);
    }
    @DeleteMapping("/delete")
    public Boolean delete(@RequestParam int id){
        return cvTechnologyService.delete(id);
    }

}
