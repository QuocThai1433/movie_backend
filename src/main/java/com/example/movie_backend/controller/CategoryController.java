package com.example.movie_backend.controller;

import com.example.movie_backend.controller.interfaces.ICategoryController;
import com.example.movie_backend.entity.Category;
import com.example.movie_backend.services.interfaces.IBaseService;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class CategoryController extends BaseController<Category, UUID> implements ICategoryController {
    public CategoryController(IBaseService<Category, UUID> service) {
        super(service);
    }
}
