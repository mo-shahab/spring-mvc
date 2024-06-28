package com.shahab.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    @GetMapping("/teaminfo")
    public String getTeamInfoName() {
        return coachName + teamName;
    }

    @GetMapping("/")
    public String sayHello() {
        return ("<h1>allahu akbar</h1>");
    }

    @GetMapping("/workout")
    public String getWorkout() {
        return ("<input placeholder=\"onetwothree\"></input>");
    }

    @GetMapping("/fortune")
    public String getFortune() {
        return new String("hello world");
    }

}
