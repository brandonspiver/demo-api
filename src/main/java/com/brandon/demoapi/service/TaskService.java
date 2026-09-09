package com.brandon.demoapi.service;

import com.brandon.demoapi.dto.CreateTaskRequest;
import com.brandon.demoapi.dto.TaskResponse;
import com.brandon.demoapi.entity.Task;
import com.brandon.demoapi.repository.TaskRepository;
import org.springframework.stereotype.Service;

@Service
public class TaskService {
    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public TaskResponse create(CreateTaskRequest req){
        Task task = new Task(req.getTitle().trim());
        Task savedTask = taskRepository.save(task);

        return new TaskResponse(savedTask.getId(), savedTask.getTitle());
    }
}
