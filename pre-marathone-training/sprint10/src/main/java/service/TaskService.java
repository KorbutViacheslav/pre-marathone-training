package service;

import model.Task;

import java.util.List;

public interface TaskService {
    boolean createTask(Task task);

    Task readTsk(String title);

    boolean updateTask(Task task);

    boolean deleteTask(String title);
    List<Task> getTaskList();
}
