package com.souradip.SpringCoreDemoApp.config;

import com.souradip.SpringCoreDemoApp.util.SwimCoach;
import com.souradip.SpringCoreDemoApp.util.Coach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
    @Bean("aquatic")
    public Coach swimCoach(){
        return new SwimCoach();
    }

}
