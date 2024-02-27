package service;

import model.User;

public interface UserService {
    boolean addUser(User user);

    User readUser(String firstName, String lastName);

    boolean updateUser(User user);

    boolean deleteUser(User user);
}
