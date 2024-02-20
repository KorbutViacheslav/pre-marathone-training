package org.example.training;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * Author: Viacheslav Korbut
 * Date: 20.02.2024
 */
@Component
@Lazy
public class PopMusic implements Music {
    @Override
    public String getSong() {
        return "Play pop music...";
    }

    @Override
    public void doMyInit() {

    }

    @Override
    public void doMyDestroy() {

    }
}
