package com.souradip.SpringCoreDemoApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
		scanBasePackages = {"com.souradip.SpringCodeDemoApp",
				"com.souradip.util"}
)
public class SpringCoreDemoAppApplication {


	public static void main(String[] args) {
		SpringApplication.run(SpringCoreDemoAppApplication.class, args);
	}

}
