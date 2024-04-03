package com.fitnesstrackingapplication.domain.progresspicture.repository;

import com.fitnesstrackingapplication.domain.progresspicture.entity.ProgressPicture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgressPictureRepository extends JpaRepository<ProgressPicture, Integer> {
}
