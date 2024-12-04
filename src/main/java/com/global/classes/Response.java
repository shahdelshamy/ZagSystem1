package com.global.classes;

import java.util.List;


public class Response {

	private String teamDetails;
	private List<Student>students;
	
	public Response(String teamDetails, List<Student> students) {
		super();
		this.teamDetails = teamDetails;
		this.students = students;
	}

	public String getTeamDetails() {
		return teamDetails;
	}

	public void setTeamDetails(String teamDetails) {
		this.teamDetails = teamDetails;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	
		
	
}
