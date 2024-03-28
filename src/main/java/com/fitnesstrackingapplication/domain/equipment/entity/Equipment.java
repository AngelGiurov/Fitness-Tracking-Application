package com.fitnesstrackingapplication.domain.equipment.entity;

import com.fitnesstrackingapplication.domain.AbstractEntity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "equipments")
public class Equipment extends AbstractEntity {
    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private byte complexityLevel;
}

