package com.odev.hrms.controller;

import com.odev.hrms.dto.SchoolDto;
import com.odev.hrms.service.SchoolService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/school")
@RequiredArgsConstructor
public class SchoolController {
    private final SchoolService schoolService;
    @PostMapping("/create")
    public ResponseEntity<SchoolDto> create(@RequestBody SchoolDto schoolDto) {
        return ResponseEntity.ok(schoolService.create(schoolDto));
    }
    @GetMapping("/getAll")
    public ResponseEntity<List<SchoolDto>> getAll(){
        return ResponseEntity.ok(schoolService.getAll());
    }
    @GetMapping("/getById")
    public ResponseEntity<SchoolDto> getById(@RequestParam int id){
        return ResponseEntity.ok(schoolService.getById(id));
    }
    @PutMapping("/update")
    public ResponseEntity<SchoolDto>  update(@RequestParam int id,@RequestBody  SchoolDto schoolDto){
        return ResponseEntity.ok(schoolService.update(id,schoolDto));
    }
    @DeleteMapping("delete")
    public Boolean delete( @RequestParam  int id){
        return schoolService.delete(id);
    }
}
