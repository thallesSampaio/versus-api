package com.example.versusapi.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "away")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Away {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 255)
    private String team;

    @Column(nullable = false)
    private int goals;

    @Column
    private int ballPossession;

    @Column
    private int finishes;

    @Column
    private int passes;

    @Column
    private int fouls;

    @OneToOne
    @JoinColumn(name = "match_id")
    private Match match;
}
