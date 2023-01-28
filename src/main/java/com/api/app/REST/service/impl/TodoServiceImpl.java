package com.api.app.REST.service.impl;


import com.api.app.REST.Model.Task;
import com.api.app.REST.Repository.TodoRepository;
import com.api.app.REST.service.ITodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TodoServiceImpl implements ITodoService {

    @Autowired
    TodoRepository todoRepository;
    @Override
    public List<Task> findAll() {
        return todoRepository.findAll();
    }

    @Override
    public Task saveOrUpdate(Task task) {
        return todoRepository.save(task);
    }

    @Override
    public void deleteTasks(Long id) {
        todoRepository.deleteById(id);
    }


}
