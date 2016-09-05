package com.rohit.model;

import java.util.Date;
import java.util.Set;

public class JobSeeker {
	private Name name;
	private String email;
	private String userName;
	private String password;
	private Date dob;
	private Address address;
	private double experience;
	private Set<Qualification> qualifications;
	private Set<Skill> skills;
	private Set<WorkExperience> workExperiences;
	private Set<Language> languages;
	private int salary;
	private Set<JobApplied> jobsApplied;

	public JobSeeker() {}

	public Name getName() {
		return name;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public double getExperience() {
		return experience;
	}

	public void setExperience(double experience) {
		this.experience = experience;
	}

	public Set<Qualification> getQualifications() {
		return qualifications;
	}

	public void setQualifications(Set<Qualification> qualifications) {
		this.qualifications = qualifications;
	}

	public Set<Skill> getSkills() {
		return skills;
	}

	public void setSkills(Set<Skill> skills) {
		this.skills = skills;
	}

	public Set<WorkExperience> getWorkExperiences() {
		return workExperiences;
	}

	public void setWorkExperiences(Set<WorkExperience> workExperiences) {
		this.workExperiences = workExperiences;
	}

	public Set<Language> getLanguages() {
		return languages;
	}

	public void setLanguages(Set<Language> languages) {
		this.languages = languages;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Set<JobApplied> getJobsApplied() {
		return jobsApplied;
	}

	public void setJobsApplied(Set<JobApplied> jobsApplied) {
		this.jobsApplied = jobsApplied;
	}
}
