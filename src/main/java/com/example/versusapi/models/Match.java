package com.example.versusapi.models;

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

    @Column(length = 255)
    private String game;

    @Column(length = 255)
    private String stadium;

    @Column(length = 10)
    private String date;

    @Column(length = 255)
    private String playersHome;

    @Column(length = 255)
    private String homeTeam;

    @Column()
    private int homeGoals;

    @Column(length = 255)
    private String awayTeam;

    @Column()
    private int awayGoals;

    @Column(length = 255)
    private String playersAway;
}