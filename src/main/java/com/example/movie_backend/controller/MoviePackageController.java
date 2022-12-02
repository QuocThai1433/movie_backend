package com.example.movie_backend.controller;

import com.example.movie_backend.controller.interfaces.IMoviePackageController;
import com.example.movie_backend.entity.MoviePackage;
import com.example.movie_backend.services.interfaces.IBaseService;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class MoviePackageController extends BaseController<MoviePackage, UUID> implements IMoviePackageController {
    public MoviePackageController(IBaseService<MoviePackage, UUID> service) {
        super(service);
    }
}
