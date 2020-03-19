<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Contacts</title>

<style>

#contacts {
  font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

#contacts td, #contacts th {
  border: 1px solid #ddd;
  padding: 8px;
}

#contacts tr:nth-child(even){background-color: #f2f2f2;}

#contacts tr:hover {background-color: #ddd;}

#contacts th {
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: left;
  background-color: #4CAF50;
  color: white;
}

a {
color:white;
background-color:blue;
}
</style>
</head>
<body>
<h3>${msg}</h3>
<h1>Your Address Book:</h1> <a href="addContactForm">Add Contact</a>
<table id="contacts">
<tr>
<th>First Name</th>
<th>Last Name</th>
<th>Email</th>
<th>Work Phone</th>
<th>Cell Phone</th>
<th>Home Phone</th>
<th>Address</th>
<th>City</th>
<th>State</th>
<th>Country</th>
<th>Zip</th>
<th>😀</th>
<th>😟</th>
</tr>
<c:forEach items="${contacts}" var="contact">
<tr>
<td>${contact.firstName }</td>
<td>${contact.lastName }</td>
<td>${contact.email }</td>
<td>${contact.workPhone }</td>
<td>${contact.cellPhone }</td>
<td>${contact.homePhone }</td>
<td>${contact.address }</td>
<td>${contact.city }</td>
<td>${contact.state }</td>
<td>${contact.country }</td>
<td>${contact.zip }</td>
<td><a href="editContact?id=${contact.id}">Edit</a> </td>
<td><a href="deleteContact?id=${contact.id}">Delete</a> </td>
</tr>
</c:forEach> 

</table>
</body>
</html>