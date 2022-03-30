package dev.probono.probono.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.probono.probono.model.dto.PersonDTO;
import dev.probono.probono.service.PersonService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/v1/persons")
public class PersonController {
    
    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping()
    public void insertPerson(@RequestBody PersonDTO personDTO) {
        System.out.println(personDTO);
        personService.insertPerson(personDTO);
    }

    @GetMapping()
    public List<PersonDTO> getAllPersons() {
        return personService.getAllPersons();
    }

    @GetMapping("/beneficiaries")
    public List<PersonDTO> getAllBeneficiaries() {
        return personService.getAllBeneficiaries();
    }
    
    @GetMapping("/donators")
    public List<PersonDTO> getAllDonators() {
        return personService.getAllDonators();
    }
}
