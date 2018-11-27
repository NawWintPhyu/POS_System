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



</script>
</style>
<script type="text/javascript">
function clearFields() {
    document.getElementById("text1").value=""
    document.getElementById("text2").value=""
}
</head>
<body>
<form action="login" method="post">
  <div class="container">
    <label for="uname"><b>Username</b></label>
    <input type="text" id="text1" placeholder="Enter Username" name="uname" required>

    <label for="psw"><b>Password</b></label>
    <input type="password" id="text2" placeholder="Enter Password" name="psw" required>
    <div class="radio">

		<input type="radio" name="role" value="admin" checked/>Admin
		<input type="radio" name="role" value="manager" />Manager
		<input type="radio" name="role" value="salePerson" />Sale Person
		

	</div>
    <label>
      <input type="checkbox" checked="checked" name="remember"> Remember me
    </label>
<!--     <button type="submit">Login</button> -->
 



 </div>
 
 <input type="submit" formaction="Home.jsp" value="Login"  onclick="clearFields()"  >
  
</form>


</body>
</html>