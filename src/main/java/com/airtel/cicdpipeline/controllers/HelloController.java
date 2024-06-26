package com.airtel.cicdpipeline.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/welcome")
	public String helloWorld() {
		return "Hello World!!";
	}
	
	@GetMapping("v2/welcome")
	public String helloWorldV2() {
		//v2.1 changes done
		return "Hello World from v2!!";
	}

}
