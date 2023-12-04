package com.souradip.SpringCoreDemoApp.util;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{


    public BaseballCoach() {
        System.out.println("In Constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getCoachDetails() {
        return "Baseball Coach returned";
    }
}
