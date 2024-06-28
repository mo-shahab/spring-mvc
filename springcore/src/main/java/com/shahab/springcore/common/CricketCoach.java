package com.shahab.springcore.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    public CricketCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String dailyWorkout() {
        return "hello you gotta workout";
    }
}
