package com.assis.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.assis.demo.services.GreetingService;


@RestController
@RequestMapping("/")
public class GreetingController {

	@Autowired
	private GreetingService service;

	public GreetingController(GreetingService service) {
		this.service = service;
	}

	@GetMapping("/greeting")
	public @ResponseBody String greeting() {
		return service.greet();
	}

}