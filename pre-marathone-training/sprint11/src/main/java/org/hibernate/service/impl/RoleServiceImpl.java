package org.hibernate.service.impl;

import org.hibernate.model.Role;
import org.hibernate.service.RoleService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author: Viacheslav Korbut
 * Date: 06.03.2024
 */
@Service
public class RoleServiceImpl implements RoleService {
    @Override
    public Role createRole(Role role) {
        return null;
    }

    @Override
    public Role readRole(int id) {
        return null;
    }

    @Override
    public Role updateRole(Role role) {
        return null;
    }

    @Override
    public boolean deleteRole(int id) {
        return false;
    }

    @Override
    public List<Role> getAllRole() {
        return null;
    }
}
