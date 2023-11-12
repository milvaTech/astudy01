package com.sta.edu.astudy01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Astudy01Application {

	public static void main(String[] args) {
		SpringApplication.run(Astudy01Application.class, args);
	}

	@GetMapping("/welcome")
	public String welcome(){
		//test
		return "Welcome to MilvaTech";
	}
}
