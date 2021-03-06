<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Stock</title>
<style>
body {
	background-color: #f8f9f9;
	margin-top: -1px;
	margin-left: -1px;
	margin-right: -1px;
}

table {
	margin-top: 30px;
	margin-left: 10px;
	margin-right: 15px;
}

div {
	text-size-adjust: auto;
}

#search {
	margin-left: 30px;
	width: 90%;
}

input {
	padding: 6px;
	font-weight: bold;
}

#btnCol{
border: 0px solid #ddd;
}

#customers {
	font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
	border-collapse: collapse;
	width: 95%;
	margin-left: 30px;
}

#customers td, #customers th {
	border: 1px solid #ddd;
	padding: 8px;
}

#customers tr:nth-child(even) {
	background-color: #f2f2f2;
	
}

#customers tr:hover {
	background-color: #ddd;
}

#customers th {
	padding-top: 12px;
	padding-bottom: 12px;
	text-align: left;
	background-color: #5d6d7e;
	color: white;
}
 #customers a:link,#customers a:visited {
    background-color: #333;
    color: white;
    padding: 14px 14px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    width: 60%;
    margin-left: 30px;
    border-radius: 8px;
}


#customers a:hover, #customers a:active {
    background-color: #5d6d7e;
}

</style>
</head>
<body>
	<%@ include file="Header.jsp"%>
	<form action="searchstock" method="post">
		<div>
			<h1 align="center">Stock Information</h1>
			<table id="search" align="center">
				<tr>
					<td>Stock Name</td>
					<td>Code No</td>
					<td>Minimun Price</td>
					<td>Maximun Price</td>
					<td>User Name</td>
					<td></td>
				</tr>

				<tr>

					<td><input type="text" name="stockName"></td>
					<td><input type="text" name="codeNo"></td>
					<td><input type="text" name="min"></td>
					<td><input type="text" name="max"></td>
					<td><input type="text" name="userName"></td>
					<td><input type="submit" name="search" value="Search"></td>
				</tr>
			</table>
			<table id="customers">
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
		</div>
		<br> <br>

	</form>
</body>
</html>