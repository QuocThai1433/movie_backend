package com.example.movie_backend.controller;

import com.example.movie_backend.controller.interfaces.IEpisodeController;
import com.example.movie_backend.entity.Episode;
import com.example.movie_backend.services.interfaces.IBaseService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class EpisodeController extends BaseController<Episode, Integer> implements IEpisodeController {
    public EpisodeController(IBaseService<Episode, Integer> service) {
        super(service);
    }


}
