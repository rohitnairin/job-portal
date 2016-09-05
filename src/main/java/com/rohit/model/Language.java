package com.rohit.model;


public class Language  {
	private int id;
	private String name;
	private Proficiency proficiency;
	private String email;
	
	public Language() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Proficiency getProficiency() {
		return proficiency;
	}

	public void setProficiency(Proficiency proficiency) {
		this.proficiency = proficiency;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}

enum Proficiency {
	NONE, LIMITED, NATIVE, WORKING;

}
