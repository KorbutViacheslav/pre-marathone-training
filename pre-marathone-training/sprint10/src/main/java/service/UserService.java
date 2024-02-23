package service;

import model.User;

public interface UserService {
    boolean addUser(User user);

    User readUser(int idUser);

    boolean updateUser(User user);

    boolean deleteUser(int idUSer);
}
