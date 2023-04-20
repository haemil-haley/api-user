package com.boilerplate.user.domain;

import jakarta.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;

    private String email;

    private String username;

    private String password;

    @Enumerated(EnumType.STRING)
    private Grade grade;

    private String profileImageUrl;
}
