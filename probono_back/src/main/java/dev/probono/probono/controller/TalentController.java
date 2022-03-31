package dev.probono.probono.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.probono.probono.model.dto.TalentDTO;
import dev.probono.probono.service.TalentService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/talents")
public class TalentController {
    
    private final TalentService talentService;

    public TalentController(TalentService talentService) {
        this.talentService = talentService;        
    }

    @GetMapping()
    public List<TalentDTO> getAllTalents() {
        return talentService.getAllTalents();
    }

    @PostMapping()
    public void insertTalent(@RequestBody TalentDTO talentDTO) {
        System.out.println(talentDTO);
        talentService.insertTalent(talentDTO);
    }
}
