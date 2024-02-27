package service;

import model.User;

import java.util.List;

public interface UserService {
    boolean addUser(User user);

    User readUser(String firstName, String lastName);

    boolean updateUser(User user);

    boolean deleteUser(User user);

    List<User> getAllUsers();
}
