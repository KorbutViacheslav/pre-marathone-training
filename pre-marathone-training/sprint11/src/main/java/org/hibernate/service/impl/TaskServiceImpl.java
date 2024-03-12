package org.hibernate.service.impl;

import jakarta.persistence.EntityNotFoundException;
import org.hibernate.model.Task;
import org.hibernate.repository.TaskRepository;
import org.hibernate.service.TaskService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author: Viacheslav Korbut
 * Date: 06.03.2024
 */
@Service
public class TaskServiceImpl implements TaskService {
    TaskRepository tR;

    public TaskServiceImpl(TaskRepository tR) {
        this.tR = tR;
    }

    @Override
    public Task createTask(Task task) {
        return tR.save(task);
    }

    @Override
    public Task readTask(Integer id) {
        return tR.findById(id).orElseThrow(() -> new EntityNotFoundException("This task not found!"));
    }

    @Override
    public Task updateTask(Task task) {
        return tR.findById(task.getId()).map(t -> {
            t.setName(task.getName());
            t.setPriority(task.getPriority());
            t.setState(task.getState());
            t.setToDo(task.getToDo());
            return tR.save(t);
        }).orElseThrow(() -> new EntityNotFoundException("Task don`t update!"));
    }

    @Override
    public boolean deleteTask(Integer id) {
        var t = tR.findById(id);
        if (t.isPresent()) {
            tR.deleteById(id);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public List<Task> getAllTask() {
        return tR.findAll();
    }
}
