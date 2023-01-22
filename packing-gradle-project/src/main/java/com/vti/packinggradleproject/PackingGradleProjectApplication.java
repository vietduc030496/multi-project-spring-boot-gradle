package com.vti.packinggradleproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.vti.firstgradleproject.*","com.vti.secondgradleproject.*"})
public class PackingGradleProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(PackingGradleProjectApplication.class, args);
	}

}
