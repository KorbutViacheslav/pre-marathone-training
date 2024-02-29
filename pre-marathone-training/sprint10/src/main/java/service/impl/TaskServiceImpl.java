package service.impl;

import model.Task;
import model.ToDo;
import org.springframework.stereotype.Service;
import service.TaskService;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Author: Viacheslav Korbut
 * Date: 21.02.2024
 */
@Service
public class TaskServiceImpl implements TaskService {
    private final ToDoServiceImpl toDoService;

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
        return getTaskList()
                .stream()
                .filter(t -> t.getTitle().equals(title))
                .findFirst()
                .orElse(null);
    }

    @Override
    public boolean updateTask(Task task) {
        var t = readTsk(task.getTitle());
        if (t == null) {
            return false;
        }
        t.setPriority(task.getPriority());
        return true;
    }

    @Override
    public boolean deleteTask(String title) {
        if (!taskCheck(title)) {
            return false;
        }
        return getTaskList().remove(readTsk(title));
    }

    public List<Task> getTaskList() {
        return toDoService.getAllToDo()
                .stream()
                .flatMap(toDo -> toDo.getTasks().stream())
                .collect(Collectors.toList());
    }

    private boolean taskCheck(Task task) {
        return getTaskList()
                .stream()
                .anyMatch(t -> t.getTitle().equals(task.getTitle()));
    }

    private boolean taskCheck(String task) {
        return getTaskList()
                .stream()
                .anyMatch(t -> t.getTitle().equals(task));
    }
}
