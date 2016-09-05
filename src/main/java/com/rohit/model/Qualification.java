package com.rohit.model;

import java.util.Date;

public class Qualification {
	private int id;
	private String name;
	private double percentage;
	private Date passingDate;
	private String institute;
	private String email;

	public Qualification() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public Date getPassingDate() {
		return passingDate;
	}

	public void setPassingDate(Date passingDate) {
		this.passingDate = passingDate;
	}

	public String getInstitute() {
		return institute;
	}

	public void setInstitute(String institute) {
		this.institute = institute;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
