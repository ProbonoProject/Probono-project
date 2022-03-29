package dev.probono.probono.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.probono.probono.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long>{
    
}
