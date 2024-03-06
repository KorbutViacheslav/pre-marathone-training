package org.hibernate.repository;

import org.hibernate.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Author: Viacheslav Korbut
 * Date: 06.03.2024
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
