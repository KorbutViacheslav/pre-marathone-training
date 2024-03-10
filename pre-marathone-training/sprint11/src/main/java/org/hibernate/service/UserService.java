package org.hibernate.service;

import org.hibernate.model.User;

import java.util.List;

/**
 * Author: Viacheslav Korbut
 * Date: 06.03.2024
 */
public interface UserService {

    User createUser(User user);

    User readUser(Integer id);

    boolean updateUser(User user);

    boolean deleteUser(User user);

    List<User> getAllUsers();
}
