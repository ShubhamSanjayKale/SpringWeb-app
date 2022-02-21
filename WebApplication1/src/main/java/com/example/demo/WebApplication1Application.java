package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebApplication1Application {
  int a=10;
	public static void main(String[] args) {
		System.out.println(" Web-Application");
		SpringApplication.run(WebApplication1Application.class, args);
	}

}
