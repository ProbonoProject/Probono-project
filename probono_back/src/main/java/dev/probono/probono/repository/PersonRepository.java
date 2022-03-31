package dev.probono.probono.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.probono.probono.model.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Long>{
<<<<<<< HEAD



    List<Person> findByListBenefitNotNull();
    List<Person> findByListDonationNotNull();
=======
    
    List<Person> findByBenefitNotNull();
    List<Person> findByDonationNotNull();
    List<Person> findByBenefitOrDonation(Long talentId1, Long talentId2);
>>>>>>> e301f045abec0e63e591d53ba174c57f1ed8da44
}
