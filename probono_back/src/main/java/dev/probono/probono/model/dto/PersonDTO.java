package dev.probono.probono.model.dto;

import java.util.List;

import dev.probono.probono.model.entity.Person;

public class PersonDTO {
    
    private Long id;
    private String name;
    private String email;
    private List<Long> listBenefit;
    private List<Long> listDonation;

    public PersonDTO() {}

    public PersonDTO(Person person) {
        this.id = person.getId();
        this.name = person.getName();
        this.email = person.getEmail();
        this.listBenefit = person.getListBenefit();
        this.listDonation = person.getListDonation();
    
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Long> getListBenefit() {
        return listBenefit;
    }

    public void setListBenefit(List<Long> listBenefit) {
        this.listBenefit = listBenefit;
    }

    public List<Long> getListDonation() {
        return listDonation;
    }

    public void setListDonation(List<Long> listDonation) {
        this.listDonation = listDonation;
    }

    
}
