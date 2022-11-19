package com.example.movie_backend.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "episode")
@Getter
@Setter
@Entity
public class Episode {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private Integer id;

    @Column (name = "episode_count")
    private Integer episodeCount;

    @Column (name = "poster_url")
    private String posterUrl;

    @Column (name = "video_url")
    private String videoUrl;

    @Column (name = "movie_id")
    private String movieId;
}
