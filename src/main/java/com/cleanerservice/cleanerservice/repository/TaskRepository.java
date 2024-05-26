package com.cleanerservice.cleanerservice.repository;

import com.cleanerservice.cleanerservice.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
