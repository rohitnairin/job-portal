package com.rohit.validation;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.opensymphony.xwork2.ActionSupport;
import com.rohit.model.JobSeeker;
import com.rohit.model.Name;
import com.rohit.util.HibernateUtil;

@SuppressWarnings("serial")
public class NewUserValidation extends ActionSupport {
	private JobSeeker newUser;
	private Name name;

	@Override
	public String execute() throws Exception {
		newUser.setName(name);
		name.setJobSeeker(newUser);
		try {
			System.out.println("Entered Block");
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction tx = session.beginTransaction();
			session.save(newUser);
			tx.commit();
			session.close();
		} catch (HibernateException e) {
			e.printStackTrace();
		}

		return SUCCESS;
	}

	@Override
	public void validate() {
		if (newUser.getEmail().length() == 0)
			addFieldError("newUser.email", "Email is Empty");
		if (newUser.getUserName().length() == 0)
			addFieldError("newUser.userName", "Username is empty");
		if (newUser.getPassword().length() == 0)
			addFieldError("newUser.password", "Password is empty");
		if (name.getFirstName().length() == 0)
			addFieldError("name.firstName", "First name is empty");
		if (name.getMiddleName().length() == 0)
			addFieldError("name.middleName", "Middle name is empty");
		if (name.getLastName().length() == 0)
			addFieldError("name.lastName", "Last name is empty");
	}

	public JobSeeker getNewUser() {
		return newUser;
	}

	public void setNewUser(JobSeeker newUser) {
		this.newUser = newUser;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

}
