package com.example.movie_backend.services.interfaces;

import com.example.movie_backend.entity.Movie;

public interface IMovieService extends IBaseService<Movie, Integer> {
    Movie getByTitle(String title);
}
