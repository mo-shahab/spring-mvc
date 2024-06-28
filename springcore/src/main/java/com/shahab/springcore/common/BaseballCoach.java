package com.shahab.springcore.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {

    public BaseballCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String dailyWorkout() {
        return "spend 30 minutes while practicing batting";
    }
}
