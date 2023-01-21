package com.example.gitjenkinsdocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GitJenkinsDockerApplication {

	@GetMapping("/")
	public String get(){
		return "hello everyone welcome to EnggAdda";
	}

	public static void main(String[] args) {
		SpringApplication.run(GitJenkinsDockerApplication.class, args);
	}

}
