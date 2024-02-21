package service;

import model.ToDo;

public interface ToDoService {
    boolean addToDo();

    ToDo readTodo();

    boolean updateToDo();

    boolean deleteTodo();
}
