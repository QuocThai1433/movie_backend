package com.example.movie_backend.services.interfaces;

import com.example.movie_backend.entity.Movie;

import java.util.UUID;

public interface IMovieService extends IBaseService<Movie, UUID> {
    Movie getByTitle(String title);
}
