package com.souradip.SpringCoreDemoApp.util;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{


    public CricketCoach() {
        System.out.println("In Constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getCoachDetails() {
        return "Cricket coach details returned!! - Field Injection";
    }
}
