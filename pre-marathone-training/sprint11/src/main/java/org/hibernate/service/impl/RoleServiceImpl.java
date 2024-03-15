package org.hibernate.service.impl;

import jakarta.persistence.EntityNotFoundException;
import org.hibernate.model.Role;
import org.hibernate.repository.RoleRepository;
import org.hibernate.service.RoleService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author: Viacheslav Korbut
 * Date: 06.03.2024
 */
@Service
public class RoleServiceImpl implements RoleService {
    RoleRepository rR;

    public RoleServiceImpl(RoleRepository rR) {
        this.rR = rR;
    }

    @Override
    public Role createRole(Role role) {
        return rR.save(role);
    }

    @Override
    public Role readRole(Integer id) {
        return rR.findById(id).orElseThrow(() -> new EntityNotFoundException("Role not found!"));
    }

    @Override
    public Role updateRole(Role role) {
        return rR.findById(role.getId()).map(r -> {
            r.setName(role.getName());
            r.setUserList(role.getUserList());
            return rR.save(r);
        }).orElseThrow(() -> new EntityNotFoundException("Role not update!"));
    }

    @Override
    public boolean deleteRole(Integer id) {
        var r = rR.findById(id);
        if (r.isPresent()) {
            rR.deleteById(id);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public List<Role> getAllRole() {
        return rR.findAll();
    }
}
