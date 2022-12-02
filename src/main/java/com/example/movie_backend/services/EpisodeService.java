package com.example.movie_backend.services;

import com.example.movie_backend.entity.Episode;
import com.example.movie_backend.services.interfaces.IEpisodeService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class EpisodeService extends BaseService<Episode,Integer> implements IEpisodeService {
    public EpisodeService(JpaRepository<Episode, Integer> repository) {
        super(repository);
    }
}
