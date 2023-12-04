package com.souradip.util;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

    @Override
    public String getCoachDetails() {
        return "Cricket coach details returned!!";
    }
}
