package com.example.demo.helloworld.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldController {

	@GetMapping("/hello")
	public String sayHello(Principal principal) {
		return "Hello " + principal.getName() + ", from a secure Spring Boot!";
	}

}
