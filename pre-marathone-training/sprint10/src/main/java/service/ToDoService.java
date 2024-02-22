package service;

import model.ToDo;

public interface ToDoService {
    boolean addToDo(ToDo toDo);

    ToDo readTodo(int idToDo);

    boolean updateToDo(ToDo toDo);

    boolean deleteTodo();
}
