<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
body{
 margin-top: 50px;
 margin-left: 20px;
 
}
table{


}

table {
	width: 80%;
}

</style>
</head>
<body>

	<form method="post" action="searchinvoice">
	    Stock CodeNo :<input type="text" name="searchStockCodeNo">
		User Name : <input type = "text" name = "userName">
		Start Date : <input type= "date" id = "start">
		End Date : <input type = "date" id = "end">
		<input type="submit" style="display: none" />
		<br><br><br>
		<table id="customers" border = "1">
			<tr>
			<th>Stock ID</th>
			<th>Stock Name</th>
			<th>Code NO</th>
			<th>Category</th>
			<th>Quantity</th>
			<th>Price</th>
			<th>Description</th>
			<th>Status</th>
			<th>User ID</th>
			
			
			</tr>
			<c:forEach var="stock" items='${stockList}'>
				<tr>
					<td>${stock.stockID}</td>
					<td>${stock.stockName}</td>
					<td>${stock.codeNo}</td>
					<td>${stock.category}</td>
					<td>${stock.quantity}</td>
					<td>${stock.price}</td>
					<td>${stock.description}</td>
					<td>${stock.status}</td>
					<td>${stock.userID}</td>
					<td><a href="updatestock?id=${stock.stockID}">Update</a></td>
				</tr>
			</c:forEach>
			</table>
	</form>
	



</body>
</html>