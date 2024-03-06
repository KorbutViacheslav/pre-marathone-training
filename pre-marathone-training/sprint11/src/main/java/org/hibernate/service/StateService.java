package org.hibernate.service;

import org.hibernate.model.State;

import java.util.List;

/**
 * Author: Viacheslav Korbut
 * Date: 06.03.2024
 */
public interface StateService {

    State createState(State state);

    State readState(int id);

    State updateState(State state);

    boolean deleteState(int id);

    List<State> getAllState();
}
