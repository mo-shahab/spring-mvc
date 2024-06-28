package com.shahab.springcore.common;

public class SwimCoach implements Coach {

    public SwimCoach() {
        System.out.println("in constructor: " + getClass().getSimpleName());
    }

    @Override
    public String dailyWorkout() {
        return "swim 1000 meters and stuff for warm up";
    }
}
