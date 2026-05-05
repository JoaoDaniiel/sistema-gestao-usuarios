package com.example.taskmanager.controller;

import com.example.taskmanager.model.Task;
import com.example.taskmanager.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
@CrossOrigin(origins = "*")
public class TaskController {

    @Autowired
    private TaskRepository repository;


    @GetMapping
    public List<Task> getAllTasks() {
        return repository.findAll();
    }

    // criar uma nova tarefa
    @PostMapping
    public Task createTask(@RequestBody Task task) {
        return repository.save(task);
    }

    // deletar uma tarefa pelo ID
    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id) {
        repository.deleteById(id);
    }
}