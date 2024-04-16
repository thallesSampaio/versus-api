package com.example.versusapi.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "home")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Home {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 255)
    private String team;

    @Column(nullable = false)
    private int goals;

    @Column(nullable = false)
    private int ballPossession;

    @Column(nullable = false)
    private int finishes;

    @Column(nullable = false)
    private int passes;

    @Column(nullable = false)
    private int fouls;
}
