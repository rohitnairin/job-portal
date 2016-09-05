<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>New User Registration</title>
<link rel="stylesheet" href="css/bootstrap.min.css">
<script src="js/bootstrap.min.js"></script>
<script src="js/jquery.min.js"></script>
</head>
<body style="background-color: #00BFFF;">
	<div class="col-md - 4"
		style="margin-left: 10%; border: 2px solid white;">
		<s:form action="registerUser">
			<s:text name="Fill out the form below"></s:text>
			<s:textfield name="newUser.email" label="Email"></s:textfield>
			<s:textfield name="newUser.userName" label="Username"></s:textfield>
			<s:textfield name="newUser.password" label="Password"></s:textfield>
			<s:textfield name="name.firstName" label="First Name"></s:textfield>
			<s:textfield name="name.middleName" label="Middle Name"></s:textfield>
			<s:textfield name="name.lastName" label="Last Name"></s:textfield>
			<s:submit value="Register" align="center"></s:submit>
		</s:form>
	</div>
</body>
</html>