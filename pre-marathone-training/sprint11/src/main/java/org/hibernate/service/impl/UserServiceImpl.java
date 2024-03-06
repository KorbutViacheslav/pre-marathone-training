package org.hibernate.service.impl;

import org.hibernate.model.User;
import org.hibernate.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author: Viacheslav Korbut
 * Date: 06.03.2024
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public User createUser(User user) {
        return null;
    }

    @Override
    public User readUser(int id) {
        return null;
    }

    @Override
    public User updateUser(int id) {
        return null;
    }

    @Override
    public boolean deleteUser(User user) {
        return false;
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }
}
