package org.hibernate.service.impl;

import org.hibernate.model.ToDo;
import org.hibernate.service.ToDoService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author: Viacheslav Korbut
 * Date: 06.03.2024
 */
@Service
public class ToDoServiceImpl implements ToDoService {
    @Override
    public ToDo createToDo(ToDo toDo) {
        return null;
    }

    @Override
    public ToDo readToDo(int id) {
        return null;
    }

    @Override
    public ToDo updateToDo(ToDo toDo) {
        return null;
    }

    @Override
    public boolean deleteToDo(int id) {
        return false;
    }

    @Override
    public List<ToDo> getAllToDo() {
        return null;
    }
}
