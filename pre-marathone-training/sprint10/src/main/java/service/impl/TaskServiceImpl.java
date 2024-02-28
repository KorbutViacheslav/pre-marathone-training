package service.impl;

import model.Priority;
import model.Task;
import model.ToDo;
import org.springframework.stereotype.Service;
import service.TaskService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Author: Viacheslav Korbut
 * Date: 21.02.2024
 */
@Service
public class TaskServiceImpl implements TaskService {
    private ToDoServiceImpl toDoService;

    public TaskServiceImpl(ToDoServiceImpl toDoService) {
        this.toDoService = toDoService;
    }

    @Override
    public boolean createTask(Task task, ToDo toDo) {
        ToDo t = toDoService.readTodo(toDo.getTitle());
        if (t == null) {
            return false;
        }
        return t.getTasks().add(task);
    }

    @Override
    public Task readTsk(String title) {
        return null;
    }

    @Override
    public boolean updateTask(Task task) {

        return true;
    }

    @Override
    public boolean deleteTask(String title) {

        return false;
    }

    public List<Task> getTaskList() {
        return toDoService.getAllToDo().stream()
                .flatMap(toDo -> toDo.getTasks().stream())
                .collect(Collectors.toList());
    }

    private boolean taskCheck(Task task) {
        return getTaskList().stream().anyMatch(t -> t.getTitle().equals(task.getTitle()));
    }
}
