package com.example.movie_backend.controller;

import com.example.movie_backend.controller.interfaces.IMovieCategoryController;
import com.example.movie_backend.entity.MovieCategory;
import com.example.movie_backend.services.interfaces.IBaseService;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MovieCategoryController extends BaseController<MovieCategory, Integer> implements IMovieCategoryController {

    public MovieCategoryController(IBaseService<MovieCategory, Integer> service) {
        super(service);
    }
}
