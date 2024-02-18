package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service

public class DemoServiceImpl {


	
	public String getDetails() {
		// TODO Auto-generated method stub
	
		return "Hello World"+System.getProperty("${env_var}");
	}

}
