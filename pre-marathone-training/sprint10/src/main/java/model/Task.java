package model;

import java.util.Objects;

public class Task {
    private String title;
    private Priority priority;

    public Task(String title, Priority priority) {
        this.title = title;
        this.priority = priority;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(title, task.title) && priority == task.priority;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, priority);
    }

    @Override
    public String toString() {
        return "Task{" +
                ", title='" + title + '\'' +
                ", priority=" + priority +
                '}';
    }
}
