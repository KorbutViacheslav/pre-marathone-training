package org.hibernate.service.impl;

import org.hibernate.model.State;
import org.hibernate.service.StateService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author: Viacheslav Korbut
 * Date: 06.03.2024
 */
@Service
public class StateServiceImpl implements StateService {
    @Override
    public State createState(State state) {
        return null;
    }

    @Override
    public State readState(int id) {
        return null;
    }

    @Override
    public State updateState(State state) {
        return null;
    }

    @Override
    public boolean deleteState(int id) {
        return false;
    }

    @Override
    public List<State> getAllState() {
        return null;
    }
}
