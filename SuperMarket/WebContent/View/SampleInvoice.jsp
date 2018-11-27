<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>invoice</title>
<style>
table {
	width: 80%;
}

#code {
	margin-top: 30px;
	margin-bottom: 30px;
}

th, td {
	border: 1px solid #111;
	padding: 8px;
}
</style>
</head>

<%@ include file="Header.jsp"%>
<body>
	<form action="" method="post">
		<div align="center" id="code">
			Product CodeNo <input type="text" required name="sCode" />
		</div>
		<table align="center" border=1>
			<tr>
				<td colspan="6" align="right">Invoice ID:<label
					name="invoiceID">#113</label><br>Date:<label name="date">30/11/2018</label>
				</td>
			</tr>
			<tr>
				<th>Item</th>
				<th>Unit Cost</th>
				<th>Quantity</th>
				<th>Price</th>
				<th></th>
			</tr>
		</table>
	</form>
</body>
</html>