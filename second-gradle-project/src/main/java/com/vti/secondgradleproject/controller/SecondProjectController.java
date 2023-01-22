package com.vti.secondgradleproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/second-project")
public class SecondProjectController {

	@GetMapping
	public String homeController() {
		return "second project hello world.";
	}

}
