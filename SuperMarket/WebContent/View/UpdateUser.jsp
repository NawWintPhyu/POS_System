<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>editUser</title>

<style>
input[type=text] {
	width: 99%;
	padding: 6px 10px;
	margin: 8px 0;
	display: inline-block;
	border: 1px solid #ccc;
	box-sizing: border-box;
}

input[type=submit] {
	width: 100%;
	padding: 10px;
	border-radius: 8px;
	background-color: #333;
	color: white;
	
}

body {
	margin-top: 0px;
	margin-left: 1px;
	margin-right: 1px;
}

form {
	border: 3px solid rgba(0, 0, 0, 0.5);
	max-width: 400px;
	margin: 0 auto;
	padding-bottom: 30px;
}
table{
	margin-top: 20px;
}
div {
    margin-left: 50px;
}

</style>
</head>
<%@ include file="Header.jsp"%>
<body>

<h1 align="center">Edit User</h1>
<form method="post" action="updateuser">
<table align="center">
  <tr>    
          <td><label>Name :</label></td>
          <td><input type="text" name="name"  value="<c:out value="${userList.userName}"/>" required/></td>
  </tr>
  <tr>    
          <td><br><label>Phone Number : </label> </td>
          <td><br><input type="text" name="phoneNumber" value="<c:out value="${userList.phoneNumber}"/>" required /></td>
  </tr>
  <tr>    
          <td><br><label>Email :</label></td>
          <td><br><input type="email" name="email" value="<c:out value="${userList.email}"/>" required /> </td>
  </tr>
   <tr>    
          <td><br><label>Address :</label></td>
          <td><br><input type="text" name="address" value="<c:out value="${userList.address}"/>" required /> </td>
  </tr>
  <tr>    
          <td><br><label>Password :</label></td>
          <td><br><input type="text" name="password" value="<c:out value="${userList.password}"/>" required /> </td>
  </tr>
 
</table>
<br> 	  
	
	<div>
	 
	    

		<input type="radio" name="radioBtn" value="<c:out value="${userList.roleID}"/>"  />Admin
		<input type="radio" name="radioBtn" value="<c:out value="${userList.roleID}"/>"  />Manager
		<input type="radio" name="radioBtn" value="<c:out value="${userList.roleID}"/>"  />Sale Person
		

	</div>
    <br><br> 
	<input type="submit" value="Edit"/>
</form>


</body>
</html>