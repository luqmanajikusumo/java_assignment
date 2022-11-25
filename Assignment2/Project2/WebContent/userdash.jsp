<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Dashboard</title>
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
	left:400px;
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
	.button1{
	background-color: #0073e6;
	color: white;
	padding: 20px 20px;
	border: none;
	border-radius: 4px;
	cursor: pointer;
	position:relative;
	left:300px;
	top:260px;
	font-size: 16px;
	transition-duration: 0.4s;
	}
	.button1:hover{
	background-color: #3399ff;
	}
	.button2{
	background-color: #0073e6;
	color: white;
	padding: 20px 20px;
	border: none;
	border-radius: 4px;
	cursor: pointer;
	position:relative;
	left:750px;
	top:200px;
	font-size: 16px;
	transition-duration: 0.4s;
	}
	.button2:hover{
	background-color: #3399ff;
	}
	td {
  	left:400px;
  	position:relative;
	}
</style>
</head>
<div class="header">
	<table>
	<tr>
	<td><div style='width: 300px;'><h3>Welcome: ${datamodel.name}</h3></div></td>
	<td><img alt="User Picture" src="E:/Fresh Start/Java and DB program/Project/Project2/src/${datamodel.name}.jpg" style="width:50px;height:50px;position:relative;left:380px;"></td>
	<td>
	<a href="./login.html"><button class="button">Log Out</button></a></td>
	</tr>
	</table>
</div>
<body>
	<form action="./code3h" method="post">
	<input type="hidden" id="name" name="name" value="${datamodel.name}">
	<input type="hidden" id="email" name="email" value="${datamodel.email}">
	<a href="./addrecord.jsp"><button class="button1">Add New Record</button></a>
	</form>
	<form action="./code4" method="post">
	<input type="hidden" id="name" name="name" value="${datamodel.name}">
	<input type="hidden" id="email" name="email" value="${datamodel.email}">
	<a href="./viewrecord.jsp"><button class="button2">View Previous Record</button></a>
	</form>
</body>
</html>