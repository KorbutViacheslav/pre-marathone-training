package org.hibernate.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * Author: Viacheslav Korbut
 * Date: 06.03.2024
 */
@Data
@Entity
public class ToDo {
    @Id
    private int id;

    private String title;

    private LocalDateTime createdAt;
}
