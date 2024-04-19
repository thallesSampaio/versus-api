package com.example.versusapi.services;

import com.example.versusapi.models.Match;

import java.util.List;

public interface MatchServices {
    Match saveMatch(Match match);

    List<Match> getAllMatch();

    Match getMatchById(Long id);

    void deleteMatch(Long id);
}
