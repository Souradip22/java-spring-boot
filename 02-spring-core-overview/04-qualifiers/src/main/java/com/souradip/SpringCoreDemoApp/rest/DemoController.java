package com.souradip.SpringCoreDemoApp.rest;

import com.souradip.SpringCoreDemoApp.util.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach tempCoach;

    @Autowired
    DemoController(Coach cricketCoach) {
        tempCoach = cricketCoach;
    }
//
//    Setter Injection
//    @Autowired
//    public void setCoach(@Qualifier("baseballCoach") Coach inpCoach){
//        tempCoach = inpCoach;
//    }



    @GetMapping("/coach")
    public String getCoachInfo(){
        return tempCoach.getCoachDetails();
    }
}
