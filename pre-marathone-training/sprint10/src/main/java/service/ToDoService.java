package service;

import model.ToDo;
import model.User;

public interface ToDoService {
    boolean addToDo(ToDo toDo, User user);

    ToDo readTodo(String title);

    boolean updateToDo(ToDo toDo);

    boolean deleteTodo(String title);
}
