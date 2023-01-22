package com.vti.firstgradleproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/first-project")
public class FirstProjectController {
	
	@GetMapping
	public String homeController() {
		return "first project hello world.";
	}

}
