package com.DEMO.CONTROLLER;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class democontroller {
	
@GetMapping("/get")
public String show() {return "Working in Show";}

@GetMapping("/set")
public String show1() {
	return "Working in show1";
}

}
