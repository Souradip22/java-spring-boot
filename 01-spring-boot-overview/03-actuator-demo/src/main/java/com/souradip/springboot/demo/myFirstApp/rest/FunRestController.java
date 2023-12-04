package com.souradip.springboot.demo.myFirstApp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;
    //expose "/" end point that return "Hello World"
    @GetMapping("/")
    public String sayHello() {
        return "Hello World" + coachName + teamName;
    }

    // another new endpoint
    @GetMapping("/workout")
    public String getWorkoutDetails() { return "Work out everyday"; }


    @GetMapping("/fortune")
    public String getFortuneDetails() { return "Fortune details"; }
}
