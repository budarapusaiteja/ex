package com.sample.sampledata;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class A {
	@GetMapping(value="/te")
	public String s() {
		return "get success";
	}
}
