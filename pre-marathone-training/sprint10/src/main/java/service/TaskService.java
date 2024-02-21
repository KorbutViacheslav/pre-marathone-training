package service;

import model.Task;

import java.util.List;

public interface TaskService {
    boolean createTask(Task task);

    Task readTsk(int id);

    boolean updateTask(Task task);

    boolean deleteTask(int id);
    List<Task> getTaskList();
}
