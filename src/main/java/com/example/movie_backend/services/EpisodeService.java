package com.example.movie_backend.services;

import com.example.movie_backend.entity.Episode;
import com.example.movie_backend.services.interfaces.IEpisodeService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class EpisodeService extends BaseService<Episode, UUID> implements IEpisodeService {
    public EpisodeService(JpaRepository<Episode, UUID> repository) {
        super(repository);
    }
}
