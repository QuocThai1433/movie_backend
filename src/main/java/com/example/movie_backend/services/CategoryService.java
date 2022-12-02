package com.example.movie_backend.services;

import com.example.movie_backend.entity.Category;
import com.example.movie_backend.services.interfaces.ICategoryService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CategoryService extends BaseService<Category, UUID> implements ICategoryService {
    public CategoryService(JpaRepository<Category, UUID> repository) {
        super(repository);
    }
}
