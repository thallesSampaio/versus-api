package com.example.versusapi.repositories;

import com.example.versusapi.models.MatchScores;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatchScoresRepository extends JpaRepository<MatchScores, Long> {
}
