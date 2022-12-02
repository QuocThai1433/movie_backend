package com.example.movie_backend.services;

import com.example.movie_backend.entity.MoviePackage;
import com.example.movie_backend.services.interfaces.IMoviePackageService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class MoviePackageService extends BaseService<MoviePackage, UUID> implements IMoviePackageService {
    public MoviePackageService(JpaRepository<MoviePackage, UUID> repository) {
        super(repository);
    }
}
