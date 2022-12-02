package com.example.movie_backend.services;

import com.example.movie_backend.entity.Comment;
import com.example.movie_backend.services.interfaces.ICommentService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class CommentService extends BaseService<Comment,Integer> implements ICommentService {
    public CommentService(JpaRepository<Comment, Integer> repository) {
        super(repository);
    }
}
