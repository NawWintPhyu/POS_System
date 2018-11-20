<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>new stock</title>
<style>
div {
    border: 1px solid black;
    margin-top: 8`0px;
    
     margin-bottom: 100px;
    margin-right: 100px;
    margin-left: 100px;
    background-color: lightblue;
    
    padding-top: 50px;
    padding-right: 30px;
    padding-bottom: 150px;
    padding-left: 80px;
    text-transform: capitalize;
text-size-adjust: auto;
   
}

</style>
</head>
<body>

<form action="createstock" method="post">
<div align="center">
<h1>Create New Stock</h1>
<table >
 <tr>
   <td>Stock Name</td>
   <td><input type = "text" name="name" required></td>
 </tr> <br>
<tr>
  <td>Stock Category</td>
  <td><input type = "text" name="category" required ></td>
 </tr> <br>
<tr>
  <td>Stock CodeNo</td>
  <td><input type = "text" name="codeNo" required></td>
 </tr><br>
 <tr>
<td>Stock Quantity</td>
<td><input type = "text" name="quantity" required></td>
</tr><br>
<tr>
<td>Stock Price</td>
<td><input type = "text" name="price" required></td>
</tr><br>
<tr>
<td>Stock Description</td>
<td><input type = "text" name="description" ></td></tr><br>

</table><br>
<input type = "submit" value="Add New Stock" align="center">
</div>
</form>


</body>
</html>