package com.example.movie_backend.services;

import com.example.movie_backend.entity.Category;
import com.example.movie_backend.services.interfaces.ICategoryService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class CategoryService extends BaseService<Category,Integer> implements ICategoryService {
    public CategoryService(JpaRepository<Category, Integer> repository) {
        super(repository);
    }
}
