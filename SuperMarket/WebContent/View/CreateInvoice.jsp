<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>createInvoice</title>

<style>
    body { background-color: aqua; }
</style>

</head>
<body>
<h1 style="">Create Invoice</h1>
<form method="get" action="createinvoice">
<table border=0>
  <tr>    
          <td><label>Stock Name :</label></td>
          <td><input type="text" name="createText1" placeholder="Enter stock name" required/></td>
  </tr>
  <tr>    
          <td><br><label>Code Number : </label> </td>
          <td><br><input type="text" name="createText2" placeholder="Enter code number" required /></td>
  </tr>
  <tr>    
          <td><br><label>Quantity :</label></td>
          <td><br><input type="text" name="createtext3" placeholder="Enter stock quantity" required /> </td>
  </tr>
   <tr>    
          <td><br><label>Price :</label></td>
          <td><br><input type="text" name="createText4" placeholder="Enter stock price" required /> </td>
  </tr>
   <tr>    
          <td><br><label>Description :</label></td>
          <td><br><input type="text" name="text5" placeholder="Enter stock description" required /> </td>
  </tr>
  <tr>
          <td><br><input type="submit" value="Cancel"/></td>
          <td><br><input type="submit" value="Print"/></td>
  </tr>
   
</table>
	  

</form>
</body>
</html>