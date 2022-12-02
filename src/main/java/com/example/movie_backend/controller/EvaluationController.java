package com.example.movie_backend.controller;

import com.example.movie_backend.controller.interfaces.IEvaluationController;
import com.example.movie_backend.entity.Evaluation;
import com.example.movie_backend.services.interfaces.IBaseService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EvaluationController extends BaseController<Evaluation, Integer> implements IEvaluationController {

    public EvaluationController(IBaseService<Evaluation, Integer> service) {
        super(service);
    }


}
