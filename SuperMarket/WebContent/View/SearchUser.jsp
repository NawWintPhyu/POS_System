<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>searchUser</title>

<style>
    body { background-color: aqua; }
   
</style>

</head>
<body>

<h1 style="">Search User</h1>
<form method="get" action="searchuser">

<table border=0>

<tr>
    <td><label>Search By UserID:</label></td>
    <td><label>Search By RoleID: </label></td>
    <td><label>Search By UserName:</label></td>
</tr>

<tr>
    <td><br><input type="text" name="searchText1" /></td>
    <td><br><input type="text" name="searchText2"  /></td>
    <td><br><input type="text" name="searchText3"  /> </td>
</tr>

<tr>
    <td></td>
    <td><br><input type="submit" value="Search"/></td>
    <td></td>
</tr>

</table>



</form>


</body>
</html>