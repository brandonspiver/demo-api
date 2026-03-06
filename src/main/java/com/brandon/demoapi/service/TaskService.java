package com.brandon.demoapi.service;

import com.brandon.demoapi.dto.CreateTaskRequest;
import com.brandon.demoapi.dto.TaskResponse;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class TaskService {
    private final AtomicLong idGen = new AtomicLong(0);

    public TaskResponse create(CreateTaskRequest req){
        long id = idGen.incrementAndGet();
        return new TaskResponse(id, req.getTitle().trim());
    }
}
