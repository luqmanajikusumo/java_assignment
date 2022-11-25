<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Profile Page</title>
<style>
	.header{
	padding: 10px;
	font-family:Arial, Helvetica;
	background-color:#0073e6;
	color: white;
	}
	body {
	font-family: Arial, Helvetica;
	background-color: #f0f0f0;
	}
	.button{
	position:relative;
	background-color:#3399ff;
	left:650px;
	color: white;
	border: none;
	border-radius: 4px;
	cursor: pointer;
	width: 100%;
	padding: 12px;
	box-sizing: border-box;
	resize: vertical;
	transition-duration: 0.4s;
	}
	.button:hover{
	background-color:#99ccff;
	color:black;
	}
	input[type=submit]{
	background-color: #0073e6;
	color: white;
	border: none;
	border-radius: 4px;
	cursor: pointer;
	font-size: 16px;
	width: 30%;
	padding: 12px;
	box-sizing: border-box;
	transition-duration: 0.4s;
	resize:  vertical;
	position: relative;
	top:10px;
	left:280px;
	}
	input[type=submit]:hover{
	background-color: #3399ff;
	}
	th, td {
  	padding-top: 10px;
  	padding-bottom: 20px;
  	padding-left: 20px;
  	padding-right: 40px;
	}
	.container{
	border-radius: 5px;
	background-color: white;
	padding: 40px;
	width: 400px;
	margin-left: 390px;
	margin-top: 90px;
	}
</style>
</head>
<div class="header">
	<table>
	<tr>
	<td style="position:relative;left:380px;"><div style='width: 300px;'><h3></h3></div></td>
	<td><img alt="User Picture" src="E:/Fresh Start/Java and DB program/Project/Project2/src/${datamodel.name}.jpg" style="width:50px;height:50px;position:relative;left:650px;"></td>
	<td>
	<a href="./login.html"><button class="button">Log Out</button></a></td>
	</tr>
	</table>
</div>
<body>
<h2 align="center">Profile</h2>
<div class="container">
<form action="./code10" method="post">
<br>
<table>
<tr>
	<td>
	<img src="E:/Fresh Start/Java and DB program/Project/Project2/src/${datamodel.name}.jpg" alt="User Photo" style="width:150px;height:150px;"/>
	</td>
</tr>
</table>
<table>
<tr>
	<td>Name: ${datamodel.name}</td>
</tr>
<tr>
	<td>Email: ${datamodel.email}</td>
</tr>
<tr>
	<td>Address: ${datamodel.address}</td>
</tr>
<tr>
	<td>Phone: ${datamodel.phone}</td>
</tr>
<tr>
	<td>City: ${datamodel.city}</td>
</tr>
<tr>
	<td>Country: ${datamodel.country}</td>
</tr>
</table>
</form>
&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;
<button onclick="printFunction()">Save as PDF</button>
<br><br>
</div>
<br><br><br><br>
<script>
   function printFunction() { 
      window.print(); 
   }
</script>
</body>
</html>