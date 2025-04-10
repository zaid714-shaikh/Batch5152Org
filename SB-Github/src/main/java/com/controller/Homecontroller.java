package com.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Homecontroller {

	@PostMapping("/")
	public void m1() {
		System.out.println("Hi");
		System.out.println("Dev-2 chanegs");
	}


	@PostMapping("/")
	public void m2() {
		System.out.println("Hi-m2");
	}

	@PostMapping("/")
	public void m3() {
		System.out.println("Hi-m3");
	}

       @PostMapping("/")
	public void m4() {
		System.out.println("Hi");
		System.out.println("Dev-2 chanegs");
	}

	

}
