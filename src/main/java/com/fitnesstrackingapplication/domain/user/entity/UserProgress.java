package com.fitnesstrackingapplication.domain.user.entity;

import com.fitnesstrackingapplication.domain.AbstractEntity;
import com.fitnesstrackingapplication.domain.user.entity.User;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserProgress extends AbstractEntity {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date date;

    @NotNull
    @Column(nullable = false)
    private Double weight;

    @NotNull
    @Column(nullable = false)
    private Integer caloriesBurned;

}

