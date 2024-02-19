package org.example.training;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * Author: Viacheslav Korbut
 * Date: 19.02.2024
 */
@Component
@Lazy
public class ClassicalMusic implements Music {

    @Override
    public String getSong() {
        return "Play classical music...";
    }

    @PostConstruct
    @Override
    public void doMyInit() {
        System.out.println("Initialization from classical music");
    }

    @PreDestroy
    @Override
    public void doMyDestroy() {
        System.out.println("Destroy from classical music...");
    }
}
