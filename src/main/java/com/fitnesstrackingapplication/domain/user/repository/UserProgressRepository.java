package com.fitnesstrackingapplication.domain.user.repository;

import com.fitnesstrackingapplication.domain.user.entity.UserProgress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserProgressRepository extends JpaRepository<UserProgress, Integer> {
}
