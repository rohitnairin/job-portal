package com.rohit.model;

import java.util.Date;
import java.util.Set;

public class Job {
	private int jobId;
	private String title;
	private String location;
	private String description;
	private String skills;
	private Date postingDate;
	private Date expiryDate;
	private String recruiterName;
	private int companyId;
	private Set<JobApplied> jobsApplied;

	public Job(){}

	public int getJobId() {
		return jobId;
	}

	public void setJobId(int jobId) {
		this.jobId = jobId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public Date getPostingDate() {
		return postingDate;
	}

	public void setPostingDate(Date postingDate) {
		this.postingDate = postingDate;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	
	public String getRecruiterName() {
		return recruiterName;
	}

	public void setRecruiterName(String recruiterName) {
		this.recruiterName = recruiterName;
	}

	public Set<JobApplied> getJobsApplied() {
		return jobsApplied;
	}

	public void setJobsApplied(Set<JobApplied> jobsApplied) {
		this.jobsApplied = jobsApplied;
	}
	
}
