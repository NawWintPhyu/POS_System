<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
<style>
body {font-family: Arial, Helvetica, sans-serif; padding-top: 65px;}
form {border: 3px solid rgba(0,0,0,0.1);
	  max-width: 500px;
      padding: 15px 35px 45px; margin: 0 auto; 
      
}

input[type=text], input[type=password] {
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    box-sizing: border-box;
}

button{
    background-color: #333;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: 100%;
}

button:hover {
    opacity: 0.8;
}

.container {
	margin-left: 80px;
    margin-right: 80px;
    padding: 16px;
}
.radio{
	margin-top: 20px;
	margin-bottom: 20px;
	padding 16px;
}

span.psw {
    float: right;
    padding-top: 16px;
}

/* Change styles for span and cancel button on extra small screens */
@media screen and (max-width: 300px) {
    span.psw {
       display: block;
       float: none;
    }
    .cancelbtn {
       width: 100%;
    }
}




</style>


</head>
<body>
<form action="login" method="post" name="formName">
  <div class="container">
    <label for="username"><b>Username</b></label>
    <input type="text" id="username" placeholder="Enter Username" name="username" onfocus="this.value='';" required>

    <label for="password"><b>Password</b></label>
    <input type="password" id="password" placeholder="Enter Password" name="password" onfocus="this.value='';" required>
    <div class="radio" id="rates">

		<input type="radio" id="r1" name="role" value="admin" />Admin
		<input type="radio" id="r2" name="role" value="manager" />Manager
		<input type="radio" id="r3" name="role" value="salePerson" />Sale Person
		

	</div>
    <label>
      <input type="checkbox"  name="remember" checked> Remember me
    </label>
    <button type="submit">Login</button>
 



 </div>
 
 
  
</form>


</body>
</html>