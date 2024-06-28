package com.shahab.springcore.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    public TennisCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String dailyWorkout() {
        return ("practice your backhand volley");
    }
}
