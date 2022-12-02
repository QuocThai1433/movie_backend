package com.example.movie_backend.services.interfaces;

import com.example.movie_backend.entity.User;
import com.example.movie_backend.model.user.LoginRequest;
import com.example.movie_backend.model.user.LoginResponse;
import com.example.movie_backend.model.user.RegisterRequest;
import com.example.movie_backend.model.user.RegisterResponse;

public interface IUserService extends IBaseService<User, Integer>{
    LoginResponse login(LoginRequest request);

    RegisterResponse register(RegisterRequest request);
}
