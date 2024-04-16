package com.example.versusapi.models;

import jakarta.persistence.*;

@Entity
@Table(name = "matchscores")
public class MatchScores {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 255)
    private String player;

    @Column(nullable = false)
    private int minute;

    @Column(nullable = false, length = 255)
    private String mode;
}