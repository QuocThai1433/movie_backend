package com.example.movie_backend.model.user;

import com.example.movie_backend.entity.User;
import lombok.*;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
public class LoginResponse {
    private boolean success;
    private User user;
}
