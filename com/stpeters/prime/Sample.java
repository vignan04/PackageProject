package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sample {
	
	@RequestMapping("/hyd/stpeters/welcome")
	public String m1() {
		return"<h1>Hello! Class</h1>";
	}

}
