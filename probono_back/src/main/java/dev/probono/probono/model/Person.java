package dev.probono.probono.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Person {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="PERSON_ID")
    private Long id;

    @Column
    private String name;

    
    private String email;

    @Convert(converter = Converter.class)
    private List<Talent> listBenefit;

    @Convert(converter = Converter.class)
    private List<Talent> listDonation;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, String email, List<Talent> listBenefit, List<Talent> listDonation) {
        this.name = name;
        this.email = email;
        this.listBenefit = listBenefit;
        this.listDonation = listDonation;
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

    public List<Talent> getListBenefit() {
        return listBenefit;
    }

    public void setListBenefit(List<Talent> listBenefit) {
        this.listBenefit = listBenefit;
    }

    public List<Talent> getListDonation() {
        return listDonation;
    }

    public void setListDonation(List<Talent> listDonation) {
        this.listDonation = listDonation;
    }
  
}
