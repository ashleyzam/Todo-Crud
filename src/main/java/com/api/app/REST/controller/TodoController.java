package com.api.app.REST.controller;

import com.api.app.REST.Model.Task;
import com.api.app.REST.Repository.TodoRepository;
import com.api.app.REST.service.ITodoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoController {
    @Autowired
    private ITodoService service;
    @GetMapping(value = "/")
    public String HolaMundo(){
        return "Hola mundo!";
    }
    @GetMapping(value = "/tasks")
    public List<Task> getTasks(){
        return  service.findAll();
    }
    @PostMapping(value = "/savetask")
    public ResponseEntity<Object> saveTask(@RequestBody @Valid Task task){
        return new ResponseEntity<>(service.saveOrUpdate(task), HttpStatus.CREATED);
    }
    @DeleteMapping(value = "/task/{id}")
    public String deleteTask(@PathVariable Long id){
        service.deleteTasks(id);
        return "deleted task succesfully";
    }
    @PutMapping(value = "/updateTask")
    public String editTask(@RequestBody @Valid Task task){
        service.saveOrUpdate(task);
        return "edited task succesfully";
    }
}
