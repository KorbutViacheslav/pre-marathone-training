package org.hibernate.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

/**
 * Author: Viacheslav Korbut
 * Date: 06.03.2024
 */
@Data
@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false, unique = true)
    @Size(min = 2, max = 300)
    private String name;

    @Enumerated(EnumType.STRING)
    private Priority priority;

    @ManyToOne
    private ToDo toDo;

    @ManyToOne
    private State state;
}
