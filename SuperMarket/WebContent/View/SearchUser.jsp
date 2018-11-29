<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta  charset=ISO-8859-1">
<title>searchUser</title>

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
<form method="post" action="searchuser">

<div>
     <h1 align="center">Search User Information</h1>

     <table id="search" align="center">

        <tr>
             <td> RoleName:</td>
             <td> UserName:</td>
             <td></td>
       </tr>

       <tr>
            <td><input type="text" name="roleName" /></td>
            <td><input type="text" name="userName"  /></td>
            <td><input type="submit" value="Search User"/></td>
      </tr>

    </table>
    
    
    <table id="customers">
    <tr>
    
    <th>User ID</th>
    <th>User Name</th>
    <th>Phone Number</th>
    <th>Email</th>
    <th>Address</th>
    <th>Password</th>
    <th>Role ID</th>
    
    </tr>
    
    <c:forEach var="tuser" items='${userList}'>
      <tr>
         <td>${tuser.userID}</td>
         <td>${tuser.userName}</td>
         <td>${tuser.phoneNumber}</td>
         <td>${tuser.email}</td>
         <td>${tuser.address}</td>
         <td>${tuser.password }
         <td>${tuser.roleID}</td>
         <td><a href="updateuser?id=${tuser.userID}">Update</a></td>
      </tr>
    </c:forEach>
    </table>
</div>



</form>


</body>
</html>