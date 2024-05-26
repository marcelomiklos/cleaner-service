package com.cleanerservice.cleanerservice.controller;


import com.cleanerservice.cleanerservice.model.Task;
import com.cleanerservice.cleanerservice.repository.TaskRepository;
import com.cleanerservice.cleanerservice.service.TaskService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@AllArgsConstructor
@Slf4j

public class TaskController {

    TaskService taskService;
    private TaskRepository taskRepository;

    @PostMapping("/tasks")
    @ResponseStatus(HttpStatus.CREATED)

    public Task createTask(@RequestBody Task task) {
        log.info("Creating task: {}", task);
        return taskService.createTask(task);
    }

    @GetMapping("/tasks")
    @ResponseStatus(HttpStatus.OK)
    public List<Task> getAllTasks() {
        log.info("Listing all tasks: {}");
        return taskService.listAllTasks();
    }

    @GetMapping("/tasks/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Task> getTaskById(@PathVariable (value = "id") Long id) {
        log.info("Listing task with id: {}", id);
        return taskService.findTaskById(id);
    }

    @PutMapping("/tasks/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Task> updateTaskById(@PathVariable (value = "id") Long id, @RequestBody Task task) {
        log.info("updating task with id: {} and the new information is: {}", id, task);
        return taskService.updateTaskById(task,id);
    }

    @DeleteMapping("/tasks/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Object> deleteTaskById(@PathVariable (value = "id") Long id) {
        log.info("Deleted task {} and with id: {}", id);
        return taskService.deleteById(id);
    }

}

