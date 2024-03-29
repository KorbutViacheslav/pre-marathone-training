package org.hibernate.service;

import org.hibernate.model.Role;

import java.util.List;

/**
 * Author: Viacheslav Korbut
 * Date: 06.03.2024
 */
public interface RoleService {

    Role createRole(Role role);

    Role readRole(Integer id);

    Role updateRole(Role role);

    boolean deleteRole(Integer id);

    List<Role> getAllRole();
}
