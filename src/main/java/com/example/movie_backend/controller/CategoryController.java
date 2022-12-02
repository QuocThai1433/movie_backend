package com.example.movie_backend.controller;

import com.example.movie_backend.controller.interfaces.ICategoryController;
import com.example.movie_backend.entity.Category;
import com.example.movie_backend.services.interfaces.IBaseService;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class CategoryController extends BaseController<Category, Integer> implements ICategoryController {
    public CategoryController(IBaseService<Category, Integer> service) {
        super(service);
    }
}
