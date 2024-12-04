package com.global.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class TaskService  {

	@Value("${team.email}")
	private String email;
	
	@Value("${team.name}")
	private String name;

	@Override
	public String toString() {
		return "[email=" + email + ", name=" + name + "]";
	}

	
}
