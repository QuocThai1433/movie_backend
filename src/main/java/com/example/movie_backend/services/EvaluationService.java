package com.example.movie_backend.services;

import com.example.movie_backend.entity.Evaluation;
import com.example.movie_backend.services.interfaces.IEvaluationService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class EvaluationService extends BaseService<Evaluation, UUID> implements IEvaluationService {
    public EvaluationService(JpaRepository<Evaluation, UUID> repository) {
        super(repository);
    }
}
