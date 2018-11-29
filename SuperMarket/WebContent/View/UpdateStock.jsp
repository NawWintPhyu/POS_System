<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>editStock</title>
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
</style>
</head>
<%@ include file="Header.jsp"%>
<body>
	<h1 align="center">Edit Stock</h1>
	<form action="updatestock" method="post">
		<table align="center">
			<tr>
				<td>Stock Name</td>
				<td><input type="text" name="name" value="<c:out value="${stockList.stockName}"/>" required /></td>
			</tr>
			<tr>
				<td>Stock CodeNo</td>
				<td><input type="text" name="codeNo" value="<c:out value="${stockList.codeNo}"/>" required></td>
			</tr>
			<tr>
				<td>Stock Category</td>
				<td><input type="text" name="category" value="<c:out value="${stockList.category}"/>" required></td>
			</tr>
			<tr>
				<td>Stock Quantity</td>
				<td><input type="text" name="quantity" value="<c:out value="${stockList.quantity}"/>" required></td>
			</tr>
			<tr>
				<td>Stock Price</td>
				<td><input type="text" name="price" value="<c:out value="${stockList.price}"/>" required></td>
			</tr>
			<tr>
				<td>Stock Description</td>
				<td><input type="text" name="description" value="<c:out value="${stockList.description}"/>"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Update" align=""></td>
			</tr>
		</table>
	</form>


</body>
</html>