<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<style>
#customers a:link, #customers a:visited {
	background-color: red;
	color: white;
	padding: 10px;
	text-align: center;
	text-decoration: none;
	display: inline-block;
	border-radius: 10px;
}

#saveID a:link, #saveID a:visited {
	background-color: #333;
	color: white;
	padding: 10px;
	text-align: center;
	text-decoration: none;
	display: inline-block;
	border-radius: 8px;
	width: 70px;
	margin-right: 5px;
	margin-left: 5px;
}

#saveID {
	margin-top: 10px;
	width: 90%
}

body {
	margin-top: -1px;
	margin-left: -1px;
	margin-right: -1px;
}

#code {
	padding-top: 30px;
	padding-bottom: 30px;
}

input {
	padding: 5px;
	margin: 0px;
}

form {
	padding-bottom: 30px;
}

td {
	padding: 10px;
	border: 0.5px solid #333;
}

table {
	margin: auto;
	table-layout: fixed;
	margin-top: 20px;
	width: 80%
}

th {
	border: 1px solid #333;
	padding: 8px;
}

table td input {
	border: none;
	border-color: transparent;
	width: 90%;
	margin-top: -10px;
	margin-bottom: 0px;
}

#field {
	position: relative;
	text-align: center;
	padding: 0;
	margin: 0;
}
</style>
</head>
<%@ include file="Header.jsp"%>
<body>
	<form action="createinvoice" method="post">
		<div align="center" id="code">
			Code NO :&nbsp;&nbsp;&nbsp;<input type="text" name="codeNo" required>
			<input type="submit" style="display: none" name="create" value="ccc"/>
		</div>
	</form>

	<table align="center" border="1" id="customers">
		<tr align="right">
			<th colspan="5" align="right">Invoice ID :&nbsp;&nbsp;&nbsp;<input
				type="text" name="invoiceID"><br> <br>Date
				:&nbsp;&nbsp;&nbsp;<input type="text" name="date">
			</th>
		</tr>
		<tr>
			<th>Item</th>
			<th>Unit Cost</th>
			<th>Quantity</th>
			<th>Price</th>
			<th></th>
		</tr>
		<c:forEach var="invoiceItem" items='${invoice}'>
			<form action="" method="post" name="price" value="ppp">
			<tr>
				<td>${invoiceItem.stockName}</td>
				<td>${invoiceItem.unitCost}</td>
				<td id="field"><input type="text" style="font-size: 15px;"><input type="submit" style="display: none"/></td>
				<td id="field"><input style="font-size: 15px;" type="text"></td>
				<td align="center" width="20px"><a href="">Remove</a></td>

			</tr>
			
			</form>
		</c:forEach>

		<tr>
			<td colspan="2" align="center">Total</td>
			<td></td>
			<td></td>
			<td></td>
		</tr>
	</table>
	<div id="saveID" align="right">
		<a href="createinvoice" name="save">Save</a> <a href="createinvoice"
			name="print">Print</a>
	</div>


</body>
</html>