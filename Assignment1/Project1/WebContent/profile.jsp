<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Profile Page</title>
<style>
	.header{
	padding: 30px;
	text-align:center;
	font-family:Arial, Helvetica;
	background-color:#e66300;
	color: white;
	}
	.topnav{
	font-family:Arial;
	background-color:#b5b5b5;
	overflow: hidden;
	text-align: center;
	}
	.topnav a {
  	float: left;
  	color: white;
  	text-align: center;
  	padding: 14px 16px;
  	text-decoration: none;
  	font-size: 14px;
	}
	.topnav a:hover {
  	background-color: #ddd;
  	color: black;
	}
	.topnav a.active {
  	background-color: #6e6e6e;
  	color: white;
	}
	body {
	font-family: Arial, Helvetica;
	background-color: #f0f0f0;
	}
	* {box-sizing: border-box;}
	input[type=text],select,textarea{
	width: 100%;
	padding: 12px;
	border: 1px solid #ccc;
	border-radius: 4px;
	box-sizing: border-box;
	margin-top: 6px;
	margin-bottom: 16px;
	resize:  vertical;
	}
	button{
	background-color: #e66300;
	color: white;
	padding: 12px 20px;
	border: none;
	border-radius: 4px;
	cursor: pointer;
	margin-left:50px;
	margin-top:10px;
	font-size: 16px;
	}
	button:hover{
	background-color: #a84800;
	}
	.footer {
  	position: fixed;
  	left: 0;
  	bottom: 0;
  	width: 100%;
  	color: white;
  	font-family:Arial, Helvetica;
	background-color:#6e6e6e;
  	text-align: center;
	}
	.container{
	border-radius: 5px;
	background-color: white;
	padding: 30px;
	width: 700px;
	margin-left: 330px;
	}
	td {
  	padding-top: 10px;
  	padding-bottom: 20px;
  	padding-left: 25px;
  	padding-right: 40px;
	}
	img{
	margin-left: 450px;
	}
</style>
</head>
<div class="header">
	<h1>Citizen Information Center</h1>
	<p>Central Information for Public</p>
</div>

<div class="topnav">
  <a href="./index.html">Home</a>
  <a href="#about">About</a>
</div> 

<div class="footer">
  <p>Web Design by Luqman Aji Kusumo</p>
</div>
<body>
<h2 align="center">Profile</h2>
<div class="container">
<form action="./code5" method="post">
<br>
<table>
<tr>
	<td>
	<img src="file:\\e:\\Fresh Start\Java and DB program\Project\Project1\src\_${datamodel.id}.jpg" alt="User Photo" style="width:150px;height:150px;"/>
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
<tr>
	<td>Education: ${datamodel.education}</td>
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
&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;
<button onclick="printFunction()">Save as PDF</button>
<br><br>
<table>
<tr>
<td><form action="./code4" method="post">
<input type="hidden" name="id" value="${datamodel.id}">
&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;
<button>Edit</button>
</form>
</td>
<td><form action="./code3" method="post">
<input type="hidden" name="id" value="${datamodel.id}">
&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;
<button>Delete</button>
</form>
</td>
</tr>
</table>
</div>
<br><br><br><br>
<script>
   function printFunction() { 
      window.print(); 
   }
</script>
</body>
</html>