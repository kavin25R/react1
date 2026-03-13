package com.university.aiagents.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Exam {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String courseName;

    private Long studentId;

    private double marks;

    private String examType;
}