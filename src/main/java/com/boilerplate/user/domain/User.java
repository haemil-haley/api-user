package com.boilerplate.user.domain;

import com.boilerplate.user.domain.type.CertificationLevel;
import com.boilerplate.user.domain.type.Grade;
import com.boilerplate.user.domain.type.SNS;
import jakarta.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;

    private String email;

    private String username;

    private String password;

    private String profileImageUrl;

    @Enumerated(EnumType.STRING)
    private Grade grade;

    @Enumerated(EnumType.STRING)
    private CertificationLevel certificationLevel;

    @Enumerated(EnumType.STRING)
    private SNS sns;

    private String userCode;

    private String inviteUserCode;
}
