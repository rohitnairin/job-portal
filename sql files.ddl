
//SQL for creating jobseeker table

CREATE TABLE jobseeker(
  email VARCHAR(25) PRIMARY KEY,
  username VARCHAR(25),
  PASSWORD VARCHAR(25),
  dob DATE,
  salary INT,
  experience DOUBLE
);

//SQL for jobseekername table
CREATE TABLE jobseekerName(
  email VARCHAR(25),
  firstName VARCHAR(25),
  middleName VARCHAR(25),
  lastName VARCHAR(25),
  PRIMARY KEY(email),
  FOREIGN KEY(email) REFERENCES jobseeker(email)
);

//SQL for table address
CREATE TABLE address(
  email VARCHAR(25) PRIMARY KEY,
  buildingInfo VARCHAR(25),
  street VARCHAR(25),
  city VARCHAR(25),
  district VARCHAR(25),
  state VARCHAR(25),
  pincode INT,
  FOREIGN KEY(email) REFERENCES jobseeker(email)
);

//SQL for qualification table
CREATE TABLE qualification(
  NAME VARCHAR(50),
  percentage DOUBLE,
  passingDate DATE,
  institute VARCHAR(50),
  email VARCHAR(25),
  FOREIGN KEY(email) REFERENCES jobseeker(email)
);

//SQL for skill table
CREATE TABLE skill(
  skillId VARCHAR(25) PRIMARY KEY,
  NAME VARCHAR(25),
  email VARCHAR(25),
  FOREIGN KEY(email) REFERENCES jobseeker(email)
);

//SQL for skill experience table
CREATE TABLE experience(
  skillId VARCHAR(25) PRIMARY KEY,
  years INT,
  months INT,
  FOREIGN KEY(skillId) REFERENCES skill(skillId)
);

//SQL for language table
CREATE TABLE LANGUAGE(
  email VARCHAR(25),
  NAME VARCHAR(25),
  proficiency VARCHAR(25),
  FOREIGN KEY(email) REFERENCES jobseeker(email)
);

//SQL for company table
CREATE TABLE company(
  companyId INT PRIMARY KEY,
  companyName VARCHAR(60),
  location VARCHAR(25),
  description VARCHAR(25),
  PASSWORD VARCHAR(25)
);

//SQL for recruiter table
CREATE TABLE recruiter(
  userName VARCHAR(25) PRIMARY KEY,
  PASSWORD VARCHAR(25),
  NAME VARCHAR(25),
  companyId INT,
  FOREIGN KEY(companyId) REFERENCES company(companyId)
);

//SQL for job table
CREATE TABLE job(
  jobId INT PRIMARY KEY,
  title VARCHAR(25),
  location VARCHAR(25),
  skills VARCHAR(25),
  postingDate DATE,
  expiryDate DATE,
  companyId INT,
  recruiterName VARCHAR(25),
  FOREIGN KEY(companyId) REFERENCES company(companyId),
  FOREIGN KEY(recruiterName) REFERENCES recruiter(userName)
);

//SQL for applied jobs
CREATE TABLE jobsApplied(
  jobId INT,
  email VARCHAR(25),
  FOREIGN KEY(jobId) REFERENCES job(jobId),
  FOREIGN KEY(email) REFERENCES jobseeker(email)
);