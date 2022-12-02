package com.example.movie_backend.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Table(name = "episode")
@Getter
@Setter
@Entity
public class Episode {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(updatable = false, nullable = false)
    private UUID id;

    @Column(name = "episode_count")
    private Integer episodeCount;

    @Column(name = "poster_url")
    private String posterUrl;

    @Column(name = "video_url")
    private String videoUrl;

    @Column(name = "movie_id")
    private String movieId;
}
