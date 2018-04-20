package com.boot.controller;



import java.sql.Timestamp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping("/")
	public String home()
	{
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		return "Finally I can have my jenkins and awsPipeline working together\n"+timestamp;
	}
}
