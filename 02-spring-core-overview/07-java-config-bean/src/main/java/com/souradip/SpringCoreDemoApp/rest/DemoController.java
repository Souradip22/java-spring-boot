package com.souradip.SpringCoreDemoApp.rest;

import com.souradip.SpringCoreDemoApp.util.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach tempCoach;
    private Coach anotherCoach;

    @Autowired
    DemoController(
            @Qualifier("aquatic") Coach swimCoach,
            @Qualifier("cricketCoach") Coach anotherCricketCoach
    ) {
        tempCoach = swimCoach;
        anotherCoach = anotherCricketCoach;
    }

    @GetMapping("/coach")
    public String getCoachInfo(){
        return tempCoach.getCoachDetails();
    }

    @GetMapping("/check")
    public String check(){
        return "Beans are equal? "+ (tempCoach == anotherCoach);
    }
}
