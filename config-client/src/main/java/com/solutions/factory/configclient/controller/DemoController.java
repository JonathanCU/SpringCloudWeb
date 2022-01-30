package com.solutions.factory.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@Value("${server.app-name}")
	private String appName;
	
	@Value("${environment}")
	private String environment;
	
	@GetMapping("/config")
	public String configHanlder() {
		return String.format("%s executing in %s", appName, environment);
	}
}
