package service.impl;

import model.ToDo;
import model.User;
import org.springframework.stereotype.Service;
import service.ToDoService;

import java.util.List;
import java.util.stream.Collectors;

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
    public boolean addToDo(ToDo toDo) {
        User user = toDo.getOwner();
        User checkUser = userService.readUser(user.getFirstName(), user.getLastName());
        if (checkUser == null)
            return false;
        return user.getMyTodos().add(toDo);
    }

    @Override
    public ToDo readTodo(String title) {
        return getAllToDo()
                .stream()
                .filter(toDo -> toDo.getTitle().equals(title))
                .findFirst().orElse(null);
    }

    @Override
    public boolean updateToDo(ToDo toDo) {
        return getAllToDo()
                .stream()
                .filter(toDo1 -> toDo1.equals(toDo))
                .findFirst()
                .map(toDo1 -> {
                    toDo1.setOwner(toDo.getOwner());
                    toDo1.setTasks(toDo.getTasks());
                    return true;
                })
                .orElse(false);
    }


    @Override
    public boolean deleteTodo(String title) {
        return getAllToDo()
                .stream()
                .filter(toDo -> toDo.getTitle().equals(title))
                .findFirst()
                .map(toDo -> {
                    toDo.getOwner().getMyTodos().remove(toDo);
                    return true;
                }).orElse(false);
    }

    @Override
    public List<ToDo> getAllToDo() {
        return userService.getAllUsers().stream()
                .flatMap(user -> user.getMyTodos().stream())
                .collect(Collectors.toList());
    }
}
