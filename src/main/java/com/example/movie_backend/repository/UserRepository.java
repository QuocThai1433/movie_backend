package com.example.movie_backend.repository;

import com.example.movie_backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    @Query(value = """
                select u from User u where u.username = :#{#username}
            """)
    Optional<User> findByFilter(String username);
}
