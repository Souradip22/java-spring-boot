package com.souradip.SpringCoreDemoApp.util;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CricketCoach implements Coach{


    public CricketCoach() {
        System.out.println("In Constructor: " + getClass().getSimpleName());
    }

    //define our init method



    @Override
    public String getCoachDetails() {
        return "Cricket coach details returned!! - Field Injection";
    }
}
