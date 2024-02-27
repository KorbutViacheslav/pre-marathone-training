package service.impl;

import model.ToDo;
import model.User;
import org.springframework.stereotype.Service;
import service.ToDoService;

/**
 * Author: Viacheslav Korbut
 * Date: 22.02.2024
 */
@Service
public class ToDoServiceImpl implements ToDoService {
    private final UserServiceImpl userService;

    public ToDoServiceImpl(UserServiceImpl userService) {
        this.userService = userService;
    }

    @Override
    public boolean addToDo(ToDo toDo, User user) {
        userService.readUser(user.getFirstName(),user.getLastName());
        toDo.setOwner(user);
        return user.getMyTodos().add(toDo);
    }

    @Override
    public ToDo readTodo(String title) {
        return null;
    }

    @Override
    public boolean updateToDo(ToDo toDo) {
        return false;
    }

    @Override
    public boolean deleteTodo(String title) {
        return false;
    }
}
