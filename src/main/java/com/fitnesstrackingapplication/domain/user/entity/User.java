package com.fitnesstrackingapplication.domain.user.entity;

import com.fitnesstrackingapplication.domain.AbstractEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class User extends AbstractEntity {
    @NotEmpty
    @Column(unique = true, nullable = false)
    private String email;

    @NotEmpty
    @Column(unique = true, nullable = false)
    private String username;

    @NotEmpty
    @Column(nullable = false)
    private String password;

    @Column(nullable = true)
    private String profilePictureUrl;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date dateJoined;

    @Column(nullable = false)
    private boolean active;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Gender gender;

    @Column(nullable = true)
    private Double weight;

    @Column(nullable = true)
    @Min(value = 0, message = "Age must be a positive number")
    private byte age;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ExperienceLevel experienceLevel;

    public enum Gender {
        MALE,
        FEMALE
    }

    public enum ExperienceLevel {
        BEGINNER,
        INTERMEDIATE,
        ADVANCED,
        ELITE
    }
}
