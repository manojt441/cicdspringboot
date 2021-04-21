package com.cicddemo.springcicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringBootCicdApplication {

	@GetMapping("/hello")
	public String getMessage(){

		return "this is message from docker container";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCicdApplication.class, args);
	}

}
