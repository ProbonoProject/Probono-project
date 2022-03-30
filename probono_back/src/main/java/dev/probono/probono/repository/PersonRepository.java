package dev.probono.probono.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.probono.probono.model.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Long>{
<<<<<<< HEAD
    
    List<Person> findByListBenefitNotNull();
    List<Person> findByListDonationNotNull();

=======
    List<Person> findByListBenefitNotNull();
    List<Person> findByListDonationNotNull();
>>>>>>> b8b612827103d8c4787874b03cd8d60e2570dff1
}
