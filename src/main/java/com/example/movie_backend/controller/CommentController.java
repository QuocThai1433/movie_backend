package com.example.movie_backend.controller;

import com.example.movie_backend.controller.interfaces.ICommentController;
import com.example.movie_backend.entity.Comment;
import com.example.movie_backend.services.interfaces.IBaseService;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CommentController extends BaseController<Comment, Integer> implements ICommentController {
    public CommentController(IBaseService<Comment, Integer> service) {
        super(service);
    }

}
