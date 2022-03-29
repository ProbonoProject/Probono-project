package dev.probono.probono.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import dev.probono.probono.model.Matching;

public interface MatchingRepository extends JpaRepository<Matching, Long>{
    
}
