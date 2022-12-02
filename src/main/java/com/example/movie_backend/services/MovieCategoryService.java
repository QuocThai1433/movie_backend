package com.example.movie_backend.services;

import com.example.movie_backend.entity.MovieCategory;
import com.example.movie_backend.services.interfaces.IMovieCategoryService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class MovieCategoryService extends BaseService<MovieCategory,Integer> implements IMovieCategoryService {
    public MovieCategoryService(JpaRepository<MovieCategory, Integer> repository) {
        super(repository);
    }
}
