package com.fitnesstrackingapplication.domain.workout.entity;

import com.fitnesstrackingapplication.domain.AbstractEntity;
import com.fitnesstrackingapplication.domain.exercise.entity.Exercise;
import com.fitnesstrackingapplication.domain.user.entity.User;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "workouts")
public class Workout extends AbstractEntity {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date date;

    @Column(nullable = false)
    private Set<Exercise> exercises;

    @Column(nullable = false)
    private short duration;

    @Column(nullable = false)
    private short restDuration;

    @Column(nullable = false)
    private short totalWeight;

    @Column(nullable = false)
    private byte totalSets;

    @Column(nullable = true)
    private String notes;

}
