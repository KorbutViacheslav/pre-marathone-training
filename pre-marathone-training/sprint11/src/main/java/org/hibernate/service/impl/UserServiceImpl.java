package org.hibernate.service.impl;

import jakarta.persistence.EntityExistsException;
import org.hibernate.model.User;
import org.hibernate.repository.UserRepository;
import org.hibernate.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author: Viacheslav Korbut
 * Date: 06.03.2024
 */
@Service
public class UserServiceImpl implements UserService {
    UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User readUser(Integer id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new EntityExistsException("This User doesn't exists in database!"));
    }

    @Override
    public boolean updateUser(User user) {
        var u = userRepository.findById(user.getId());
        if (u.isPresent()) {
            userRepository.save(user);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean deleteUser(User user) {
        var u = userRepository.findById(user.getId());
        if (u.isPresent()) {
            userRepository.delete(user);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
