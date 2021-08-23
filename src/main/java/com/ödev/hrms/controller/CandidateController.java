package com.odev.hrms.controller;

import com.odev.hrms.dto.CandidateDto;
import com.odev.hrms.service.CandidateService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/candidate")
@RequiredArgsConstructor
public class CandidateController {
    private final CandidateService candidateService;

    @PostMapping("/create")
    public ResponseEntity<CandidateDto> createCandidate(@RequestBody CandidateDto candidateDto){
        return ResponseEntity.ok(candidateService.createCandidate(candidateDto));
    }
    @GetMapping("/getAll")
    public ResponseEntity<List<CandidateDto>> getAll(){
        return ResponseEntity.ok(candidateService.getAll());
    }
    @GetMapping("/getByCandidateId")
    public ResponseEntity<CandidateDto> getByCandidateId(@RequestParam int id){

        return ResponseEntity.ok(candidateService.getByCandidateId(id));
    }
    @PutMapping("/update")
    public ResponseEntity<CandidateDto> update(@RequestParam int id,@RequestBody CandidateDto candidateDto){
        return ResponseEntity.ok(candidateService.update(id,candidateDto));
    }
    @DeleteMapping("/delete")
    public Boolean delete(@RequestParam int id){
        return candidateService.delete(id);
    }

}
