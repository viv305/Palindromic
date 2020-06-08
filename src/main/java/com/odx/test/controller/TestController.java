package com.odx.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.odx.test.service.TestService;

@RestController
public class TestController {
	@Autowired
	private TestService testService;
	
	@PostMapping("/storeLongestPalindromValue")
	public String storeLongestPalindromValue(@RequestBody String input) {
		return testService.longestPalindromValue(input);
	}
	
	@GetMapping("/getLongestPalindromValue/{input}")
	public String getLongestPalindromValue(@PathVariable("input") String input) {
		return testService.getLongestPalindromValue(input);
	}

}
