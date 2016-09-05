package com.rohit.model;

import java.util.Set;

public class Company {
	private String companyId;
	private String companyName;
	private String location;
	private String description;
	private String password;
	private Set<Recruiter> recruiters;
	
	public Company(){}


	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<Recruiter> getRecruiters() {
		return recruiters;
	}

	public void setRecruiters(Set<Recruiter> recruiters) {
		this.recruiters = recruiters;
	}
	
	public String getCompanyId() {
		return companyId;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	
	
}
