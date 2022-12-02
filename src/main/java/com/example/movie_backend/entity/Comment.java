package com.example.movie_backend.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "comment")
@Getter
@Setter
@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "content")
    private String content;

    @Column(name = "episode_id")
    private String episodeId;

    @Column(name = "user_id")
    private Integer userId;
}
