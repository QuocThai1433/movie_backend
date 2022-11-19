package com.example.movie_backend.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "movie_category")
@Getter
@Setter
@Entity
public class MovieCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "movie_id")
    private Integer movieId;

    @Column(name = "category_id")
    private Integer categoryId;
}
