package com.university.aiagents.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Agent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    private String domain;

    @Column(length = 2000)
    private String instructions;
}