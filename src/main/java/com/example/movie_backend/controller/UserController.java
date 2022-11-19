package com.example.movie_backend.controller;

import com.example.movie_backend.entity.User;
import com.example.movie_backend.model.user.LoginRequest;
import com.example.movie_backend.model.user.LoginResponse;
import com.example.movie_backend.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/user/")
public class UserController {
    private final UserRepository userRepository;

    @PostMapping("login")
    public ResponseEntity<LoginResponse> login(LoginRequest request) {
        // Tìm user với username
        Optional<User> optionalUser = userRepository.findByFilter(request.getUsername());
        if (optionalUser.isEmpty()) {
            return ResponseEntity.badRequest().body(
                    new LoginResponse().setSuccess(false)
            );
        }

        User user = optionalUser.get();

        // Nếu có thì kiểm tra mật khẩu

        return ResponseEntity.ok(
                new LoginResponse().setSuccess(true).setUser(user)
        );
    }
    @GetMapping("list")
    public ResponseEntity<List<User>> getList()
    {
        return ResponseEntity.ok(userRepository.findAll());
    }

    @GetMapping("{id}/detail")
    public ResponseEntity<User> getDetail(@PathVariable Integer id)
    {
        Optional<User> userOptional = userRepository.findById(id);

        if(userOptional.isEmpty())
        {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }

        return ResponseEntity.ok(userOptional.get());
    }


    @PostMapping("create")
    public ResponseEntity<User> create(@RequestBody User user) {
        return ResponseEntity.ok(userRepository.save(user));
    }

    @PutMapping("update")
    public ResponseEntity<User> update(User user) {
        return ResponseEntity.ok(userRepository.save(user));
    }

    @DeleteMapping("{id}/deleteId")
    public ResponseEntity<Integer> delete(@PathVariable Integer id) {
        userRepository.deleteById(id);
        return ResponseEntity.ok(id);
    }


}
