package com.boilerplate.user.domain;

import com.boilerplate.user.domain.type.CertificationStatus;
import com.boilerplate.user.domain.type.Gender;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Certification {

    @Id
    @GeneratedValue
    public Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    public User user;

    private String phoneNumber;

    private LocalDate birthday;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Enumerated(EnumType.STRING)
    private CertificationStatus status;

    private String responseId;
}