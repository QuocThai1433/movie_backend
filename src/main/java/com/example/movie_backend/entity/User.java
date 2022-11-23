package com.example.movie_backend.entity;

import com.example.movie_backend.entity.enumerate.UserType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "users")
@Getter
@Setter
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "username", unique = true)
    private String username;

    @Column(name = "email")
    private String email;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Enumerated(EnumType.STRING)
    @Column(name = "type")
    private UserType type;

    @Column(name = "movie_package_id")
    private Integer moviePackageId;

    private String namePro;
}
