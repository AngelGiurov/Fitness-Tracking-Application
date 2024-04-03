package com.fitnesstrackingapplication.domain.exercise.entity;

import com.fitnesstrackingapplication.domain.AbstractEntity;
import com.fitnesstrackingapplication.domain.equipment.entity.Equipment;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "exercises")
public class Exercise extends AbstractEntity {
    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String instructions;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Set<MuscleGroup> muscle;

    @Column(nullable = true)
    private Equipment equipment;

    @Column(nullable = false)
    private byte sets;

    @Column(nullable = false)
    private byte reps;

    @Column(nullable = false)
    private short weight;

    private LevelOfDifficulty levelOfDifficulty;

    public enum MuscleGroup {
        CHEST,
        BACK,
        LEGS,
        SHOULDERS,
        ARMS,
        ABS,
        FULL_BODY,
        CARDIO,
        OTHER
    }

    public enum LevelOfDifficulty{
        VERY_EASY,
        EASY,
        MEDIUM,
        HARD,
        VERY_HARD
    }
}
