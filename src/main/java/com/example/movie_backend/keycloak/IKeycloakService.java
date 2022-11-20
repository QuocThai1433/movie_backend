package com.example.movie_backend.keycloak;

import com.example.movie_backend.model.user.RegisterRequest;
import org.keycloak.representations.AccessTokenResponse;

import java.util.UUID;

public interface IKeycloakService {

    UUID register(RegisterRequest request);

    AccessTokenResponse token(String username, String password);
}
