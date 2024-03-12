package org.hibernate.service.impl;

import jakarta.persistence.EntityNotFoundException;
import org.hibernate.model.State;
import org.hibernate.repository.StateRepository;
import org.hibernate.service.StateService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author: Viacheslav Korbut
 * Date: 06.03.2024
 */
@Service
public class StateServiceImpl implements StateService {
    StateRepository sR;

    public StateServiceImpl(StateRepository sR) {
        this.sR = sR;
    }

    @Override
    public State createState(State state) {
        return sR.save(state);
    }

    @Override
    public State readState(Integer id) {
        return sR.findById(id).orElseThrow(() -> new EntityNotFoundException("State don`t found!"));
    }

    @Override
    public State updateState(State state) {
        return sR.findById(state.getId()).map(s -> {
            s.setName(state.getName());
            s.setTaskList(state.getTaskList());
            return sR.save(s);
        }).orElseThrow(() -> new EntityNotFoundException("State don`t update!"));
    }

    @Override
    public boolean deleteState(Integer id) {
        var s = sR.findById(id);
        if (s.isPresent()) {
            sR.deleteById(id);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public List<State> getAllState() {
        return sR.findAll();
    }
}
