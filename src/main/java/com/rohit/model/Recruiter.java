package com.rohit.model;

import java.util.Set;

public class Recruiter implements Comparable<Recruiter>{
	private String name;
	private String userName;
	private String password;
	private int companyId;
	private Set<Job> jobsPosted;
	
	public Recruiter(){}

	public Recruiter(String name, String userName, String password, int companyId) {
		this.name = name;
		this.userName = userName;
		this.password = password;
		this.companyId = companyId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public Set<Job> getJobsPosted() {
		return jobsPosted;
	}

	public void setJobsPosted(Set<Job> jobsPosted) {
		this.jobsPosted = jobsPosted;
	}

	@Override
	public int compareTo(Recruiter r) {
		return userName.compareToIgnoreCase(r.getUserName());
	}
}
