package org.hibernate.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

import java.util.List;

/**
 * Author: Viacheslav Korbut
 * Date: 06.03.2024
 */
@Data
@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "name",nullable = false, unique = true)
    private String name;

    @OneToMany(mappedBy = "role")
    private List<User> userList;
}
