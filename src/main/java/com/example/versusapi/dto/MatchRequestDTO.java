package com.example.versusapi.dto;
public record MatchRequestDTO(Long id, String game, String stadium, String date, String playersHome, String homeTeam, int homeGoals, String awayTeam, int awayGoals, String playersAway) {
}
