package service.impl;

import model.User;
import org.springframework.stereotype.Service;
import service.UserService;

import java.util.LinkedList;
import java.util.List;

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
        return userList.add(user);
    }

    @Override
    public User readUser(int idUser) {
        return userList.get(idUser);
    }

    @Override
    public boolean updateUser(User user) {
        return false;
    }

    @Override
    public boolean deleteUser(int idUSer) {
        User user = readUser(idUSer);
        return userList.remove(user);
    }
}
