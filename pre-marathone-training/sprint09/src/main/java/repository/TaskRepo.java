package repository;

import model.Priority;
import model.Task;

import java.util.LinkedList;
import java.util.List;

public class TaskRepo {
    private final List<Task> todo;

    public TaskRepo() {
        todo = new LinkedList<>();
        todo.add(new Task("Task #1", Priority.MEDIUM));
        todo.add(new Task("Task #2", Priority.LOW));
    }

    public boolean create(Task task) {
        boolean status = todo.stream().anyMatch(t -> t.getTitle().equals(task.getTitle()));
        if (!status) {
            return todo.add(task);
        }
        return false;
    }

    public Task read(int id) {
        return todo.stream().filter(task -> task.getId() == id).findFirst().orElse(null);
    }

    public boolean update(Task newTask) {
        Task oldTask = read(newTask.getId());
        if (oldTask != null) {
            boolean status = all().stream()
                    .filter(task -> task.getId() != oldTask.getId())
                    .anyMatch(task -> task.getTitle().equals(newTask.getTitle()));
            if (!status) {
                return todo.set(todo.indexOf(oldTask), newTask) != null;
            }
            return false;
        }
        return false;
    }

    public boolean delete(int id) {
        Task task = read(id);
        if (task != null) {
            return todo.remove(task);
        }
        return false;
    }

    public List<Task> all() {
        return todo;
    }

    public void deleteAll() {
        todo.clear();
    }

    private static TaskRepo taskRepo = null;

    public synchronized static TaskRepo getTaskRepo() {
        if (taskRepo == null) {
            taskRepo = new TaskRepo();
        }
        return taskRepo;
    }
}
