package com.springboot.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class WelcomeController {
 @GetMapping("/rohan")
	public String rohan() {
	 return "This is the profile for rohan  tiwari acc";
 }
 @GetMapping("/siddharth")
	public String siddharth() {
	 return "This is the profile for siddharth Sony";
 }	
}
