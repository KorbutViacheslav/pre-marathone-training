package org.hibernate.service.impl;

import org.hibernate.model.Task;
import org.hibernate.service.TaskService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author: Viacheslav Korbut
 * Date: 06.03.2024
 */
@Service
public class TaskServiceImpl implements TaskService {
    @Override
    public Task createTask(Task task) {
        return null;
    }

    @Override
    public Task readTask(int id) {
        return null;
    }

    @Override
    public Task updateTask(Task task) {
        return null;
    }

    @Override
    public boolean deleteTask(int id) {
        return false;
    }

    @Override
    public List<Task> getAllTask() {
        return null;
    }
}
