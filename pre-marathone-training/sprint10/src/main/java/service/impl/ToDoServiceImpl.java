package service.impl;

import model.ToDo;
import org.springframework.stereotype.Service;
import service.ToDoService;

/**
 * Author: Viacheslav Korbut
 * Date: 22.02.2024
 */
@Service
public class ToDoServiceImpl implements ToDoService {
    @Override
    public boolean addToDo(ToDo toDo) {
        return false;
    }

    @Override
    public ToDo readTodo(int idToDo) {
        return null;
    }

    @Override
    public boolean updateToDo(ToDo toDo) {
        return false;
    }

    @Override
    public boolean deleteTodo() {
        return false;
    }
}
