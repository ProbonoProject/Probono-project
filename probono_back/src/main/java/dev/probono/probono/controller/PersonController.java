package dev.probono.probono.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    // @GetMapping("/user")
    // public Long userId(PersonDTO personDTO) { 
        
    //     Long userId = personDTO.getId();
        
    //     return userId;
    // } 

    @GetMapping("/user/{userId}")
    public String getBookWithName(@PathVariable String userId) {
        return userId;
    }
    
    @GetMapping("/user/DTO")
    public PersonDTO getPersonDTO(PersonDTO personDTO) {
    return personDTO;
    }

    @PostMapping("/user/post")
    public String insertBook(@RequestBody PersonDTO personDTO) {
        PersonDTO personId = personDTO;
        return personId.toString();
    }

    @GetMapping("user/id")
    public PersonDTO getOnePerson(@RequestParam Long personId) {
        return personService.getOnePerson(personId);
    }
}
