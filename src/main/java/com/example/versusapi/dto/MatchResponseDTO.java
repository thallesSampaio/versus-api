package com.example.versusapi.dto;

import com.example.versusapi.models.Match;

public record MatchResponseDTO(Long id, String game, String stadium, String date, String playersHome, String homeTeam, int homeGoals, String awayTeam, int awayGoals, String playersAway) {
    public MatchResponseDTO(Match match){
        this(match.getId(), match.getGame(), match.getStadium(), match.getDate(), match.getPlayersHome(), match.getHomeTeam(),
                match.getHomeGoals(), match.getAwayTeam(), match.getAwayGoals(), match.getPlayersAway());
    }
}