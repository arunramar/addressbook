<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<body>
<h1>Login</h1>
<form action="loginSuccess" method="POST">
Email: <input type="text" name="email"/>
Password:<input type="password" name="password"/>
<input type="submit" value="login"/>
</form>
</body>
</html>