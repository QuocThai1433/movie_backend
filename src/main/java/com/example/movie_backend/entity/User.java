package com.example.movie_backend.entity;

import com.example.movie_backend.entity.enumerate.UserType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Table(name = "users")
@Getter
@Setter
@Entity
@SuperBuilder
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(updatable = false, nullable = false, columnDefinition = "BINARY(16)")
    private UUID id;

    private String fullName;

    private String firstName;

    private String lastName;

    private String username;

    private String email;

    private String phoneNumber;

    @Enumerated(EnumType.STRING)
    private UserType type;


    private Integer moviePackageId;
}
