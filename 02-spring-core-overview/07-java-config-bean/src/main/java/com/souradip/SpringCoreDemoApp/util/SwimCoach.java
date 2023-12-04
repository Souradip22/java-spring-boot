package com.souradip.SpringCoreDemoApp.util;

public class SwimCoach implements Coach{

    public SwimCoach(){
        System.out.println("In Constructor : " + getClass().getSimpleName());
    }
    @Override
    public String getCoachDetails() {
        return "Returned Swim coach - ";
    }
}
