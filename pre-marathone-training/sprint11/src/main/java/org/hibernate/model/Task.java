package org.hibernate.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

/**
 * Author: Viacheslav Korbut
 * Date: 06.03.2024
 */
@Data
@Entity
public class Task {
    @Id
    private int id;

    private String name;

    private Priority priority;
}
