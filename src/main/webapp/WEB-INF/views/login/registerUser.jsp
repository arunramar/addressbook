<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>User Registration</h1>
<form action="registerUser" method="POST">
First Name: <input type="text" name="firstName"/><br/>
Last Name: <input type="text" name="lastName" /><br/>
User name / email :<input type="email" name="email"/><br/>
Password: <input type="password" name="password"/><br/>
Confirm Password: <input type="password" name="confirmPassword"/><br/>
<input type="submit" value="Register"/><br/>
</form>
</body>
</html>