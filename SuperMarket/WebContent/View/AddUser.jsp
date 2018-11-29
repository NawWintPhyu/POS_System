<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>addUser</title>

<style>
input[type=text] ,input[type=email]{
	width: 100%;
	padding: 6px 8px;
	margin: 5px 0;
	display: inline-block;
	border: 1px solid #ccc;
	box-sizing: border-box;
}

input[type=submit] {
	width: 86%;
	padding: 13px;
	border-radius: 8px;
	background-color: #333;
	color: white;
	margin-left: 22px;
	
	
}

div{
	margin-left: 20px;
}
body {
	margin-top: -1px;
	margin-left: -1px;
	margin-right: -1px;
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

</style>
</head>
<%@ include file="Header.jsp"%>
<body>

<h1 align="center">Create New User</h1>
<form method="post" action="adduser">
<table align="center">
  <tr>    
          <td><label>Name :</label></td>
          <td><input type="text" name="name"  required/></td>
  </tr>
  <tr>    
          <td><br><label>Phone Number : </label> </td>
          <td><br><input type="text" name="phoneNumber"  required /></td>
  </tr>
  <tr>    
          <td><br><label>Email :</label></td>
          <td><br><input type="email" name="email"  required /> </td>
  </tr>
   <tr>    
          <td><br><label>Address :</label></td>
          <td><br><input type="text" name="address"  required /> </td>
  </tr>
  <tr>    
          <td><br><label>Password :</label></td>
          <td><br><input type="text" name="password"  required /> </td>
  </tr>
  <tr>    
          <td><br><label>Retype confirm password:</label></td>
          <td><br><input type="text" name="retypePassword"  required /> </td>
  </tr>
</table>
<br> 	  
	
	<div>

		<input type="radio" name="radioBtn" value="admin" />Admin
		<input type="radio" name="radioBtn" value="manager" />Manager
		<input type="radio" name="radioBtn" value="salePerson" />Sale Person
		

	</div>
    <br><br> 
	<input type="submit" value="Add User"/>
</form>

</body>
</html>