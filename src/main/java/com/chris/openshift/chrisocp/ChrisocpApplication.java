package com.chris.openshift.chrisocp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChrisocpApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChrisocpApplication.class, args);
        System.out.println("Welcome to Openshift learning");
	}

}
