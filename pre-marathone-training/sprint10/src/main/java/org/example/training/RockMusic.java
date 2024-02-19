package org.example.training;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class RockMusic implements Music {

    @Override
    public String getSong() {
        return "Play ROCK music";
    }

    @PostConstruct
    @Override
    public void doMyInit() {
        System.out.println("Placing a record in the player...");
    }

    @PreDestroy
    @Override
    public void doMyDestroy() {
        System.out.println("The record is put into the player...");
    }
}
