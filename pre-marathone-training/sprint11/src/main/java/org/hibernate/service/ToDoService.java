package org.hibernate.service;

import org.hibernate.model.ToDo;

import java.util.List;

/**
 * Author: Viacheslav Korbut
 * Date: 06.03.2024
 */
public interface ToDoService {

    ToDo createToDo(ToDo toDo);

    ToDo readToDo(int id);

    ToDo updateToDo(ToDo toDo);

    boolean deleteToDo(int id);

    List<ToDo> getAllToDo();
}
