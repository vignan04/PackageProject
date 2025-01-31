package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class UserName {
	@RequestMapping("/hyd/username")
	public String m1(@RequestParam String username) {
		return "<h1>Hello "+ username  + " Yo!!</h1>";
	}

}
