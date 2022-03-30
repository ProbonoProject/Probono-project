package dev.probono.probono.service;

import java.util.List;

import dev.probono.probono.model.dto.PersonDTO;

public interface PersonService {
    void insertPerson(PersonDTO personDTO);
    List<PersonDTO> getAllPersons();
    List<PersonDTO> getAllBeneficiaries();
    List<PersonDTO> getAllDonators();
}
