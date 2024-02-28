package service;

import model.Task;
import model.ToDo;

import java.util.List;

public interface TaskService {
    boolean createTask(Task task, ToDo toDo);

    Task readTsk(String title);

    boolean updateTask(Task task);

    boolean deleteTask(String title);
    List<Task> getTaskList();
}
