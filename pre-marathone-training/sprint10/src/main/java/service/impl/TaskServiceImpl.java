package service.impl;

import model.Priority;
import model.Task;
import org.springframework.stereotype.Service;
import service.TaskService;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Viacheslav Korbut
 * Date: 21.02.2024
 */
@Service
public class TaskServiceImpl implements TaskService {
    private final ToDoServiceImpl toDoService;
    private final List<Task> taskList;

    {
        taskList = new ArrayList<>();
        taskList.add(new Task("Task #1", Priority.MEDIUM));
        taskList.add(new Task("Task #2", Priority.LOW));
    }

    public TaskServiceImpl(ToDoServiceImpl toDoService) {
        this.toDoService = toDoService;
    }

    @Override
    public boolean createTask(Task task) {
        if (taskCheck(task)) {
            return false;
        }
        return taskList.add(task);
    }

    @Override
    public Task readTsk(String title) {
        return taskList.stream()
                .filter(task -> task.getTitle().equals(title))
                .findFirst().orElseThrow(null);
    }

    @Override
    public boolean updateTask(Task task) {
        Task t = taskList.stream()
                .filter(task1 -> task1.getTitle().equals(task.getTitle()))
                .findFirst().orElseThrow(null);
        if (t == null) {
            return false;
        }
        int ind = taskList.indexOf(t);
        taskList.set(ind, task);
        return true;
    }

    @Override
    public boolean deleteTask(String title) {
        Task task = taskList.stream()
                .filter(task1 -> task1.getTitle().equals(title))
                .findFirst().orElseThrow(null);
        if (taskCheck(task)) {
            return taskList.remove(task);
        }
        return false;
    }

    public List<Task> getTaskList() {
        return taskList;
    }

    private boolean taskCheck(Task task) {
        return taskList.stream()
                .anyMatch(t -> t.equals(task));
    }
}
