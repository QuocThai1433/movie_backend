package com.example.movie_backend.entity;

import com.example.movie_backend.entity.enumerate.MoviePackageType;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Table(name = "movie_package")
@Getter
@Setter
@Entity
public class MoviePackage {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(updatable = false, nullable = false)
    private UUID id;

    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    private MoviePackageType type;
}
