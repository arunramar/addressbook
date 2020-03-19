<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display Contact</title>
</head>
<body>
<h1>Edit Contact:</h1>
<form action="editContactSave" method="POST">
<input type="hidden" name="id" value="${contact.id}" />
First Name:<input type="text" name="firstName" value="${contact.firstName }"/><br/>
Last Name:<input type="text" name="lastName" value="${contact.lastName }"/><br/>
Email:<input type="text" name="email" value="${contact.email }"/><br/>
Work Phone:<input type="text" name="workPhone" value="${contact.workPhone }"/><br/>
Cell Phone:<input type="text" name="cellPhone" value="${contact.cellPhone }"/><br/>
Home Phone:<input type="text" name="homePhone" value="${contact.homePhone }"/><br/>
Address:<input type="text" name="address" value="${contact.address }"/><br/>
City:<input type="text" name="city" value="${contact.city }"/><br/>
State:<input type="text" name="state" value="${contact.state }"/><br/>
Country:<input type="text" name="country" value="${contact.country }"/><br/>
Zip:<input type="text" name="zip" value="${contact.zip }"/><br/>
<input type="submit" value="Submit"/>
</form>
${msg}<br />
<p><a href="/addressbook/getContacts">Display all Contacts</a></p>
</body>
</html>