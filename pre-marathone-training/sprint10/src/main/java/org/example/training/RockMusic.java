package org.example.training;

public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Play ROCK music";
    }

    @Override
    public void doMyInit() {
        System.out.println("Placing a record in the player...");
    }

    @Override
    public void doMyDestroy() {
        System.out.println("The record is put into the player...");
    }
}
