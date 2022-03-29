package dev.probono.probono.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.probono.probono.model.Matching;

public interface MatchRepository extends JpaRepository<Matching, Long>{
    
}
