package com.nagarro.DevOpsAssignment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

	@GetMapping("/")
	public String home() {
		return "sample page running";
	}
	
}
