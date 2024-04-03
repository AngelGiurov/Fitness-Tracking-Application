package com.fitnesstrackingapplication.domain.user.repository;

import com.fitnesstrackingapplication.domain.user.entity.User;
import lombok.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    @NonNull
    List<User> findAll();
}
