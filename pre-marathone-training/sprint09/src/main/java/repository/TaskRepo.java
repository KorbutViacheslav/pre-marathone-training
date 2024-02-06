package repository;

import model.Priority;
import model.Task;

import java.util.LinkedList;
import java.util.List;

public class TaskRepo {
    private final List<Task> listOfTask;

    private TaskRepo() {
        listOfTask = new LinkedList<>();
        listOfTask.add(new Task("Task #1", Priority.MEDIUM));
        listOfTask.add(new Task("Task #2", Priority.LOW));
    }

    public boolean create(Task task) {
        if (!isTaskTitleTaken(task.getTitle())) {
            listOfTask.add(task);
            return true;
        }

        return false;
    }

    public Task read(int id) {
        return listOfTask.stream().filter(task -> task.getId() == id).findFirst().orElse(null);
    }

    public boolean update(Task task, int id) {
        int index = listOfTask.indexOf(read(id));
        return listOfTask.set(index, task) != null;
    }


    public boolean delete(int id) {
        Task task = read(id);
        if (task != null) {
            return listOfTask.remove(task);
        }
        return false;
    }

    public List<Task> all() {
        return listOfTask;
    }

    public void deleteAll() {
        listOfTask.clear();
    }

    private static TaskRepo taskRepository = null;

    public synchronized static TaskRepo getTaskRepository() {
        if (taskRepository == null) {
            taskRepository = new TaskRepo();
        }
        return taskRepository;
    }

    public boolean isTaskTitleTaken(String title) {
        return listOfTask.stream().anyMatch(task -> task.getTitle().equals(title));
    }

}
