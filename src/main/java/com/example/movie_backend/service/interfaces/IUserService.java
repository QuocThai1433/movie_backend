package com.example.movie_backend.service.interfaces;

import com.example.movie_backend.entity.User;
import com.example.movie_backend.model.user.LoginRequest;
import com.example.movie_backend.model.user.LoginResponse;
import com.example.movie_backend.model.user.RegisterRequest;
import com.example.movie_backend.model.user.RegisterResponse;

import java.util.List;

public interface IUserService {
    LoginResponse login(LoginRequest request);

    RegisterResponse register(RegisterRequest request);

    List<User> getList();
}
