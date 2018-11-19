<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>New User Password</title>
<style type="text/css">
body {font-family: Arial, Helvetica, sans-serif; padding-top: 65px;}
form {border: 3px solid rgba(0,0,0,0.1);
	  max-width: 500px;
      padding: 15px 35px 45px; margin: 0 auto; 
      
}
input[type=password] ,button{
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #333;
    box-sizing: border-box;
}
.container {
	margin-left: 80px;
    margin-right: 80px;
    padding: 16px;
}

</style>
</head>
<body>
<form action="">
  <div class="container">
    <input type="password" placeholder="Password" name="password" required>
	<input type="password" placeholder="Comfirm Password" name="cpassword" required>      
    <button type="submit"><b>Login</b></button>  
</form>
</body>
</html>