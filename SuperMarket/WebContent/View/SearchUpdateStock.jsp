<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body{
background-color: lightblue;
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

<table>
<tr>
   <td>Enter Stock Id</td>
   <td><input type="text" name="codeNo"></td>
   <td>Enter Stock Code No:</td>
   <td><input type="text" name="codeNo"></td>
   <td>Enter Stock Name:</td>
   <td><input type="text" name="name"></td>
   <td>Enter Stock Category:</td>
   <td> <input type="text" name="category"></td>
 </tr>
 
 <tr>

   <td> Enter Stock Minimun Price:</td>
   <td><input type="text" name="min"></td>
   <td>  Enter Stock Maximun Price:</td>
   <td><input type="text" name="max"></td>
   <td>Enter User ID:</td>
   <td><input type="text" name="userId"></td>
   <td>Enter User Name:</td>
   <td><input type="text" name="userName"></td>
 </tr>
</table>
<br><br>
<div align="center">
 <input type="button" value="Search Stock" id="searchStock" margin="left" width="30px">&nbsp;
 <input type="button" value="Update Stock" id="updateStock" margin="left">
 </div>
  
  
</div><br><br>
<div id="div1">
 <textarea rows="60" cols="1000">
  Stock Information
 </textarea>
</div>

</body>
</html>