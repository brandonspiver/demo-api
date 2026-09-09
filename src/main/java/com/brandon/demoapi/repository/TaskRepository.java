package com.brandon.demoapi.repository;

import com.brandon.demoapi.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.concurrent.atomic.AtomicLong;

public interface TaskRepository extends JpaRepository<Task, Long> {
    public class save extends AtomicLong {
        public save(AtomicLong atomicLong) {
        }
    }
}
