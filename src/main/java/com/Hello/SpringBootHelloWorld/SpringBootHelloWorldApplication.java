package com.Hello.SpringBootHelloWorld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootHelloWorldApplication {
	
	@GetMapping("/Hello")
	public String getHello() {
		
		return "HelloWorld";
	}
	
	@GetMapping("/")
	public String getHelloWorld() {
		
		return " Welcome to HelloWorld";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHelloWorldApplication.class, args);
	}

}
