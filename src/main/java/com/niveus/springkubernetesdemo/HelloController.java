package com.niveus.springkubernetesdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/hello")
	String hello(@RequestParam(required = false) String foo) {
		return "hello This kubernetes demo...... from Niveus Solutions.";
	}	

}
