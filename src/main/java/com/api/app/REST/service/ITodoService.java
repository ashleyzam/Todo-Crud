package com.api.app.REST.service;

import com.api.app.REST.Model.Task;
import com.api.app.REST.Repository.TodoRepository;

import java.util.List;

public interface ITodoService {

    List<Task> findAll();
     Task saveOrUpdate(Task task);
    void deleteTasks(Long id);
//    void editTask(Task task);

}