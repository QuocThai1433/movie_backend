package com.example.movie_backend.model.user;

import com.example.movie_backend.entity.User;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LoginResponse {
    private boolean success;
    private User user;
}
