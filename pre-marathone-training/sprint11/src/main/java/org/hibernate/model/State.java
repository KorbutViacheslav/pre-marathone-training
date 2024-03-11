package org.hibernate.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.LinkedList;
import java.util.List;

/**
 * Author: Viacheslav Korbut
 * Date: 06.03.2024
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "state")
public class State {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, unique = true)
    @Size(min = 2, max = 300)
    private String name;

    @OneToMany(mappedBy = "state", cascade = CascadeType.ALL)
    private List<Task> taskList = new LinkedList<>();
}
