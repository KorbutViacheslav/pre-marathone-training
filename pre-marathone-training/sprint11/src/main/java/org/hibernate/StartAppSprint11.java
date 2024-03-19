package org.hibernate;

import org.hibernate.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StartAppSprint11 implements CommandLineRunner {
    StateService service;

    public StartAppSprint11(StateService service) {
        this.service = service;
    }

    public static void main(String[] args) {
        SpringApplication.run(StartAppSprint11.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Running Spring Boot Application");


        System.out.println(service.readState(5));
    }
}
