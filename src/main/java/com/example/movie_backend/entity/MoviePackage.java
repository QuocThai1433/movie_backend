package com.example.movie_backend.entity;

import com.example.movie_backend.entity.enumerate.MoviePackageType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "movie_package")
@Getter
@Setter
@Entity
public class MoviePackage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    private MoviePackageType type;
}
