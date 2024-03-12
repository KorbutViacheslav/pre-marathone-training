package org.hibernate.service;

import org.hibernate.model.ToDo;

import java.util.List;

/**
 * Author: Viacheslav Korbut
 * Date: 06.03.2024
 */
public interface ToDoService {

    ToDo createToDo(ToDo toDo);

    ToDo readToDo(Integer id);

    ToDo updateToDo(ToDo toDo);

    boolean deleteToDo(Integer id);

    List<ToDo> getAllToDo();
}
