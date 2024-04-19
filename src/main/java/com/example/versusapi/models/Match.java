package com.example.versusapi.models;

import com.example.versusapi.dto.MatchRequestDTO;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Cascade;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "match")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column(nullable = false, length = 255)
    private String game;

    @Column(length = 255)
    private String stadium;

    @Column(nullable = false, length = 10)
    private String date;

    @Column(nullable = false, length = 255)
    private String playersHome;

    @Column(nullable = false, length = 255)
    private String homeTeam;

    @Column(nullable = false)
    private int homeGoals;

    @Column(nullable = false, length = 255)
    private String awayTeam;

    @Column(nullable = false)
    private int awayGoals;

    @Column(nullable = false, length = 255)
    private String playersAway;

    public Match(MatchRequestDTO dto) {
        this.game = dto.game();
        this.stadium = dto.stadium();
        this.date = dto.date();
        this.playersHome = dto.playersHome();
        this.homeTeam = dto.homeTeam();
        this.homeGoals = dto.homeGoals();
        this.playersAway = dto.playersAway();
        this.awayTeam = dto.awayTeam();
        this.awayGoals = dto.awayGoals();
    }
}