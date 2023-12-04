package com.souradip.SpringCoreDemoApp.rest;

import com.souradip.SpringCoreDemoApp.util.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

//    private Coach tempCoach;
//    Constructor Injection
//    @Autowired
//    DemoController(Coach cricketCoach) {
//        tempCoach = cricketCoach;
//    }
//
//    Setter Injection
//    @Autowired
//    public void setCoach(Coach inpCoach){
//        tempCoach = inpCoach;
//    }

//    Field Injection
    @Autowired
    private Coach tempCoach;
    // No need Constructor Injection or Setter Injection


    @GetMapping("/coach")
    public String getCoachInfo(){
        return tempCoach.getCoachDetails();
    }
}
