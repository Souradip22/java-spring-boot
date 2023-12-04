package com.souradip.SpringCoreDemoApp.util;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach{

    @Override
    public String getCoachDetails() {
        return "Football Coach returned";
    }
}
