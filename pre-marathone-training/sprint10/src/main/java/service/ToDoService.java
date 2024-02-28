package service;

import model.ToDo;
import model.User;

import java.util.List;

public interface ToDoService {
    boolean addToDo(ToDo toDo);

    ToDo readTodo(String title);

    boolean updateToDo(ToDo toDo);

    boolean deleteTodo(String title);

    List<ToDo> getAllToDo();
}
