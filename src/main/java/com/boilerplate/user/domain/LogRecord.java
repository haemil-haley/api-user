package com.boilerplate.user.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class LogRecord {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Enumerated(EnumType.STRING)
    private Client client;

    @Enumerated(EnumType.STRING)
    private LogStatus status;

    private String ip;

    private String deviceId;

    private LocalDateTime createdAt;

    private String createdBy;
}
