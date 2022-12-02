package com.example.movie_backend.services;

import com.example.movie_backend.entity.Movie;
import com.example.movie_backend.repository.MovieRepository;
import com.example.movie_backend.services.interfaces.IMovieService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MovieService extends BaseService<Movie, Integer> implements IMovieService {
    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        super(movieRepository);
        this.movieRepository = movieRepository;
    }

    @Override
    public Movie getByTitle(String title) {
        Optional<Movie> optional = movieRepository.getByViTitle(title);
        if (optional.isEmpty()) {
            return null;
        }
        return optional.get();
    }
}
