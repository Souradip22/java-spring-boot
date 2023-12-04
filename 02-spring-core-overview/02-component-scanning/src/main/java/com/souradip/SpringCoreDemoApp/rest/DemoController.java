package com.souradip.SpringCoreDemoApp.rest;

import com.souradip.util.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    Coach tempCoach;

    @Autowired
    DemoController(Coach cricketCoach) {
        tempCoach = cricketCoach;
    }

    @GetMapping("/")
    public String getCoachInfo(){
        return tempCoach.getCoachDetails();
    }
}
