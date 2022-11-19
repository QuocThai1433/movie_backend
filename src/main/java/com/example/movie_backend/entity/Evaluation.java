package com.example.movie_backend.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "evaluation")
@Getter
@Setter
@Entity
public class Evaluation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "star")
    private Integer star;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "movie_id")
    private Integer movieId;
}
