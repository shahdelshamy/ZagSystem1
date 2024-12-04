package com.global.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.global.classes.Response;
import com.global.classes.Student;

import com.global.service.TaskService;

@RestController
public class TaskController {

	@Autowired
	private TaskService taskService;
	
	@GetMapping("/")
	public Response getMessage() {
		return new Response(
	            taskService.toString(),
	            List.of(
	                    new Student(1, "Shahd", 21),
	                    new Student(2, "Ahmed", 21),
	                    new Student(3, "Mahmoud", 25),
	                    new Student(4, "Nada", 23)
	            )
	    );
	}
	
	@GetMapping("/students")
	public List<Student>getStudents(){
		return List.of(
				new Student(1,"Shahd",21),
				new Student(2,"Ahmed",21),
				new Student(3,"Mahmoud",25),
				new Student(4,"Nada",23)
				);
	}
	
	
	
	
}
