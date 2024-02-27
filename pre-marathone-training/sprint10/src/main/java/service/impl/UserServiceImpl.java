package service.impl;

import model.User;
import org.springframework.stereotype.Service;
import service.UserService;

import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

/**
 * Author: Viacheslav Korbut
 * Date: 26.02.2024
 */
@Service
public class UserServiceImpl implements UserService {
    private final List<User> userList;

    public UserServiceImpl() {
        userList = new LinkedList<>();
    }

    @Override
    public boolean addUser(User user) {
        if (checkUser(user).isPresent()) {
            return false;
        }
        return userList.add(user);
    }

    @Override
    public User readUser(String firstName, String lastName) {
        return userList.stream()
                .filter(u -> u.getFirstName().equals(firstName) && u.getLastName().equals(lastName))
                .findFirst()
                .orElse(null);
    }

    @Override
    public boolean updateUser(User user) {
        var optionalUser = checkUser(user);
        if (optionalUser.isPresent()) {
            var userToUpdate = optionalUser.get();
            userToUpdate.setFirstName(user.getFirstName());
            userToUpdate.setLastName(user.getLastName());
            userToUpdate.setPassword(user.getPassword());
            userToUpdate.setMyTodos(user.getMyTodos());
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteUser(User user) {
        if (checkUser(user).isPresent()) {
            userList.remove(user);
        }
        return false;
    }

    @Override
    public List<User> getAllUsers() {
        return userList;
    }

    private Optional<User> checkUser(User user) {
        return userList.stream()
                .filter(u -> u.getEmail().equals(user.getEmail()))
                .findFirst();
    }
}
