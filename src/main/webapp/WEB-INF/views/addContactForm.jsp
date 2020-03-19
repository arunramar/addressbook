<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Contact</title>

<style>
input[type=text], select {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}

input[type=submit] {
  width: 100%;
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

input[type=submit]:hover {
  background-color: #45a049;
}

div {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
}

</style>
</head>
<body>
${msg}
<h1>Add Contact:</h1>
<form action="addContact" method="POST">
First Name:<input type="text" name="firstName"/><br/>
Last Name:<input type="text" name="lastName"/><br/>
Email:<input type="text" name="email"/><br/>
Work Phone:<input type="text" name="workPhone"/><br/>
Cell Phone:<input type="text" name="cellPhone"/><br/>
Home Phone:<input type="text" name="homePhone"/><br/>
Address:<input type="text" name="address"/><br/>
City:<input type="text" name="city"/><br/>
State:<input type="text" name="state"/><br/>
Country:<input type="text" name="country"/><br/>
Zip:<input type="text" name="zip"/><br/>
<input type="submit" value="Submit"/>
</form>

</body>
</html>