package dev.probono.probono.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.probono.probono.model.entity.Person;
import dev.probono.probono.model.dto.PersonDTO;
import dev.probono.probono.repository.PersonRepository;

@Service
public class PersonServiceImpl implements PersonService {
    
    @Autowired
    PersonRepository personRepository;

    @Override
    public void insertPerson(PersonDTO personDTO) {

        Person person = new Person();
        person.setName(personDTO.getName());
        person.setEmail(personDTO.getEmail());
        person.setListBenefit(personDTO.getListBenefit());
        person.setListDonation(personDTO.getListDonation());

        personRepository.save(person);
        
    }

    @Override
    public List<PersonDTO> getAllPersons() {
        
        List<Person> list  = personRepository.findAll();
        List<PersonDTO> result = list.stream().map(r -> new PersonDTO(r)).collect(Collectors.toList());
        
        return result;
    }

    @Override
    public PersonDTO getOnePerson(Long personId) {

        try{
            Person person = personRepository.getById(personId);
            PersonDTO result = new PersonDTO(person);

            return result;
        } catch(EntityNotFoundException e) {
            e.printStackTrace();
            System.out.println("올바른 아이디를 입력하세요.");
            return null;
        }
        
    }

    @Override
    public List<PersonDTO> getAllBeneficiaries() {

        List<Person> list = personRepository.findByListBenefitNotNull();
        List<PersonDTO> result = list.stream().map(r -> new PersonDTO(r)).collect(Collectors.toList());
        
        return result;
    }

    @Override
    public List<PersonDTO> getAllDonators() {

        List<Person> list = personRepository.findByListDonationNotNull();
        List<PersonDTO> result = list.stream().map(r -> new PersonDTO(r)).collect(Collectors.toList());
        return result;
    }

}
