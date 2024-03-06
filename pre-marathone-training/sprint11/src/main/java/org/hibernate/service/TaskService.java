package org.hibernate.service;

import org.hibernate.model.Task;

import java.util.List;

/**
 * Author: Viacheslav Korbut
 * Date: 06.03.2024
 */
public interface TaskService {

    Task createTask(Task task);

    Task readTask(int id);

    Task updateTask(Task task);

    boolean deleteTask(int id);

    List<Task> getAllTask();
}
