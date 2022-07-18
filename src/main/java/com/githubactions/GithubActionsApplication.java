package com.githubactions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubActionsApplication {
	
	@GetMapping("/cicd")
	public String hello() {
		return "Welcome to CICD Pipeline using Github Actions";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(GithubActionsApplication.class, args);
	}

}
