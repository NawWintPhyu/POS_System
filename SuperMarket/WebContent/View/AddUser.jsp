<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<style>
    body { background-color: aqua; }
     
</style>

<body>
</head>
<body>

<h1 style="">New User</h1>
<form method="get" action="AddUserSurvlet">
<table border=0>
  <tr>    
          <td><label>Name :</label></td>
          <td><input type="text" name="addText1" placeholder="Enter your name" required/></td>
  </tr>
  <tr>    
          <td><br><label>Phone No : </label> </td>
          <td><br><input type="text" name="addText2" placeholder="Enter your phone number" required /></td>
  </tr>
  <tr>    
          <td><br><label>Email :</label></td>
          <td><br><input type="email" name="addText3" placeholder="Enter your email" required /> </td>
  </tr>
   <tr>    
          <td><br><label>Address :</label></td>
          <td><br><input type="text" name="addText4" placeholder="Enter your address" required /> </td>
  </tr>
</table>
<br> 	  
	
	<div>

		<input type="radio" name="radioBtn" value="admin" />Admin
		<input type="radio" name="radioBtn" value="manager" />Manager
		<input type="radio" name="radioBtn" value="salePerson" />Sale Person
		

	</div>
    <br><br> 
	<input type="submit" value="Next"/>
</form>

</body>
</html>