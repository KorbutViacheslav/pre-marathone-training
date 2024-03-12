package org.hibernate.service;

import org.hibernate.model.Task;

import java.util.List;

/**
 * Author: Viacheslav Korbut
 * Date: 06.03.2024
 */
public interface TaskService {

    Task createTask(Task task);

    Task readTask(Integer id);

    Task updateTask(Task task);

    boolean deleteTask(Integer id);

    List<Task> getAllTask();
}
