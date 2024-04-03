package com.fitnesstrackingapplication.domain.progresspicture.entity;

import com.fitnesstrackingapplication.domain.AbstractEntity;
import com.fitnesstrackingapplication.domain.workout.entity.Workout;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProgressPicture extends AbstractEntity {
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "workout_id", nullable = false, unique = true)
    private Workout workout;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date date;

    @Column(nullable = false)
    private String imageUrl;

}
