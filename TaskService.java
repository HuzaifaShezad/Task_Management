package com.example.taskmanagement.service;

import com.example.taskmanagement.dto.TaskDto;
import java.util.List;

public interface TaskService {
    TaskDto createTask(TaskDto taskDto);
    TaskDto updateTask(Long id, TaskDto taskDto);
    void deleteTask(Long id);
    List<TaskDto> getAllTasks();
    TaskDto getTaskById(Long id);
}
