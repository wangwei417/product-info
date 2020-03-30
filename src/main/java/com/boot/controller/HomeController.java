package com.boot.controller;



import java.sql.Timestamp;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@Value("${currentProperty}")
	private String maxactive;

	@Value("${anothervalue}")
	private String anotherVal;
	
	@Value("${myconfig.properties1}")
	private String properties1;	

	@RequestMapping("/")
	public String home()
	{
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		//spring.datasource.tomcat.max-active=10
		java.util.Properties p = new Properties();
		String currentconfig = p.getProperty("spring.datasource.tomcat.max-active");
		return "Finally I can have my jenkins and awsPipeline working together\n"+timestamp+
				" current config:"+maxactive +
				"another value from configmap is: " + anotherVal;
	}

	@GetMapping("config-value")
	public String configFromValue() {
		return "properties1: " + properties1 + "\n";
	}	

	@GetMapping("version")
	public String version() {
		return "version: 1.1" ;
	}	

}
