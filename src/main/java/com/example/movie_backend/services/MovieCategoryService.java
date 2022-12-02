package com.example.movie_backend.services;

import com.example.movie_backend.entity.MovieCategory;
import com.example.movie_backend.services.interfaces.IMovieCategoryService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class MovieCategoryService extends BaseService<MovieCategory, UUID> implements IMovieCategoryService {
    public MovieCategoryService(JpaRepository<MovieCategory, UUID> repository) {
        super(repository);
    }
}
