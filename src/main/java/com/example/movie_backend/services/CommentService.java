package com.example.movie_backend.services;

import com.example.movie_backend.entity.Comment;
import com.example.movie_backend.services.interfaces.ICommentService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CommentService extends BaseService<Comment, UUID> implements ICommentService {
    public CommentService(JpaRepository<Comment, UUID> repository) {
        super(repository);
    }
}
