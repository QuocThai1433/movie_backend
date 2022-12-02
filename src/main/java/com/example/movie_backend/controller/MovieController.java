package com.example.movie_backend.controller;

import com.example.movie_backend.controller.interfaces.IMovieController;
import com.example.movie_backend.entity.Movie;
import com.example.movie_backend.services.interfaces.IBaseService;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MovieController extends BaseController<Movie, Integer> implements IMovieController {

    public MovieController(IBaseService<Movie, Integer> service) {
        super(service);
    }
}
