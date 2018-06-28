package com.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/docker")
public class SpringBootController {

	@GetMapping
	public String getMapping() {
		return "Hello!, Welcome to Springboot Docker";
	}
}