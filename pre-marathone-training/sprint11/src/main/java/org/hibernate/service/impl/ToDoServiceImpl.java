package org.hibernate.service.impl;

import jakarta.persistence.EntityExistsException;
import org.hibernate.model.ToDo;
import org.hibernate.repository.ToDoRepository;
import org.hibernate.service.ToDoService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author: Viacheslav Korbut
 * Date: 06.03.2024
 */
@Service
public class ToDoServiceImpl implements ToDoService {
    ToDoRepository tDR;

    public ToDoServiceImpl(ToDoRepository toDoRepository) {
        this.tDR = tDR;
    }

    @Override
    public ToDo createToDo(ToDo toDo) {
        return tDR.save(toDo);
    }

    @Override
    public ToDo readToDo(Integer id) {
        return tDR.findById(id).orElseThrow(() -> new EntityExistsException("This toDo is absent!"));
    }

    @Override
    public ToDo updateToDo(ToDo toDo) {
        return tDR.findById(toDo.getId()).map(t -> {
            t.setTitle(toDo.getTitle());
            t.setOwner(toDo.getOwner());
            t.setCreatedAt(toDo.getCreatedAt());
            t.setTaskList(toDo.getTaskList());
            t.setCollaborators(toDo.getCollaborators());
            return tDR.save(t);
        }).orElseThrow(() -> new EntityExistsException("ToDo not update!"));
    }

    @Override
    public boolean deleteToDo(Integer id) {
        var tD = tDR.findById(id);
        if (tD.isPresent()) {
            tDR.delete(tD.get());
            return true;
        } else {
            return false;
        }
    }

    @Override
    public List<ToDo> getAllToDo() {
        return tDR.findAll();
    }
}
