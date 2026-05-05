package com.example.taskmanager.service;

import com.example.taskmanager.model.Task;
import com.example.taskmanager.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepository repository;

    public List<Task> listarTodas() {
        return repository.findAll();
    }

    public Task salvar(Task task) {
        return repository.save(task);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}