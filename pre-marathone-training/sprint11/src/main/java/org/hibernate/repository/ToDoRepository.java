package org.hibernate.repository;

import org.hibernate.model.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Author: Viacheslav Korbut
 * Date: 06.03.2024
 */
@Repository
public interface ToDoRepository extends JpaRepository<ToDo, Integer> {
}
