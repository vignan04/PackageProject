package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MaxMin {

	@RequestMapping("/find/max/min")
	public MaxMin m1(@RequestParam int a,int b,int c) {
		int max=0,min=0;
		if(a>b) {
			max=a;
			min=b;
			
		}
		else  {
			max=b;
			min=c;
		}
		if(c>max)max=c;
		if(c<min)min=c;
		
		MaxMin maxmin=new MaxMin();
		return maxmin;
	}
}
