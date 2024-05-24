package com.elice.ustory.domain.user.entity;

import com.elice.ustory.global.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.Builder;

import java.time.LocalDateTime;

@Entity
@Builder
@Table(name = "users")
public class Users extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, name = "email", length = 20)
    private String email;

    @Column(name = "name", length = 10)
    private String name;

    @Column(unique = true, name = "nickname", length = 10)
    private String nickname;

    @Column(name = "password", length = 100)
    private String password;

    @Column(name = "profile_img", length = 255)
    private String profileImg;

    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;
}