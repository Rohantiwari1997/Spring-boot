package com.springboot.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class WelcomeController {
 @GetMapping("/sanket")
	public String sanket() {
	 return "This is the profile for sanket acc";
 }
 @GetMapping("/siddharth")
	public String siddharth() {
	 return "This is the profile for siddharth Sony";
 }	
 @GetMapping("/naveen")
	public String naveen() {
	 return "This is the profile for naveens Sony";
 }		
 @GetMapping("/riya")
	public String riya() {
	 return "This is the profile for riya Sony";
 }
}
