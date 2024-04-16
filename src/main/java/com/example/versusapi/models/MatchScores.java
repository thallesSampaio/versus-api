package com.example.versusapi.models;

import jakarta.persistence.*;

@Entity
@Table(name = "matchscores")
public class MatchScores {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 255)
    private String player;

    @Column
    private int minute;

    @Column(length = 255)
    private String mode;

    @ManyToOne
    @JoinColumn(name = "match_id")
    private Match match;
}