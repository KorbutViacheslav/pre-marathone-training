package service;

import model.User;

public interface UserService {
    boolean addUser();

    User readUser();

    boolean updateUser();

    boolean deleteUser();
}
