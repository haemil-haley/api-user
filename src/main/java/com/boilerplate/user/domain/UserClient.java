package com.boilerplate.user.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "user_client")
public class UserClient {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private Client client;

    private boolean activated;

    @Enumerated(EnumType.STRING)
    private UseStatus status;
}
