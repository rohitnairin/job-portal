<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Job Portal</title>
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/homepage.css">
<script src="js/bootstrap.min.js"></script>
<script src="js/jquery.min.js"></script>
</head>
<body>

	<div class="container homeheader col-md-12">
		<h1 class="text-center">Welcome to IT Job Portal</h1>
	</div>

	<img class="img-responsive center-block" src="img/homepgimage.jpg"
		alt="home page image" style="margin-bottom: 5%">

	<div class="  col-md-4 col-md-offset-2 login">
		<s:form action="verifyUser" mwthod="post">
			<s:text name="Login Details"></s:text>
			<s:textfield key="email" label="Username"></s:textfield>
			<s:password key="password" label="Password"></s:password>
			<s:submit value="Login" class="btn btn-success"></s:submit>
		</s:form>
	</div>

	<div class="col-md-4 col-md-offset-8 login">
		<s:form action="verifyRecruiter" method="post">
			<s:text name="Recruiter Login"></s:text>
			<s:textfield label="Company" key="company"></s:textfield>
			<s:textfield key="userName" label="Username"></s:textfield>
			<s:textfield key="password" label="Password"></s:textfield>
			<s:submit value="Login" class="btn btn-success"></s:submit>
		</s:form>
	</div>

	<div class="col-md-2 col-md-offset-6 login">
		<a href="registerUser.jsp" class="btn btn-primary">New User</a> <a
			href="registerCompany.jsp" class="btn btn-primary">Company
			Registration</a> <a href="companyLogin.jsp" class="btn btn-primary">Company
			Login</a>
	</div>

</body>
</html>