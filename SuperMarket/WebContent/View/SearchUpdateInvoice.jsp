<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
body{
      background-color: lightblue
}
div{
 text-transform: capitalize;
text-size-adjust: auto;
}
textara{
align :center;
}

</style>
</head>
<body>
<div>
Enter User Id<input type="text" name="user" id="user">&nbsp;
Enter User Name<input type="text" name="name" id="userName">&nbsp;
Enter Start Date&nbsp;<input type="text" name="start" id="startDate">&nbsp;
Enter End Date&nbsp; <input type="text" name="end" id="endDate">
&nbsp;&nbsp;&nbsp;
<input type="button" value="Search Invoice" id="searchInvoice" >&nbsp;
<input type="button" value="Update Invoice" id="updateInvoice">

</div><br><br>
<div border=1>

<textarea rows="50" cols="500" align="center">
  Invoice Information
</textarea>
</div>

</body>
</html>