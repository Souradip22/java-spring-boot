package com.souradip.SpringCoreDemoApp.util;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{

    @Override
    public String getCoachDetails() {
        return "Baseball Coach returned";
    }
}
