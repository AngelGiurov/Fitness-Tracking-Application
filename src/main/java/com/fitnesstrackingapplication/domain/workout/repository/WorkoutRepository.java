package com.fitnesstrackingapplication.domain.workout.repository;

import com.fitnesstrackingapplication.domain.workout.entity.Workout;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkoutRepository extends JpaRepository<Workout, Integer> {

}
