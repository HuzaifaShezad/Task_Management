package com.example.taskmanagement.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "tasks")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String description;

    private String assignedTo;

    @Enumerated(EnumType.STRING)
    private TaskStatus status;

    public enum TaskStatus {
        PENDING, IN_PROGRESS, COMPLETED
    }
}
