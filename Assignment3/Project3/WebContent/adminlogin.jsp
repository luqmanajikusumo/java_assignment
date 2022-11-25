<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Kwik Convenience Store</title>
<style>
	.header{
	padding: 10px;
	font-family:Arial, Helvetica;
	background-color:#0073e6;
	color: white;
	}
	.center{
	text-align:center;
	}
	body {
	font-family: Arial, Helvetica;
	background-color: #f0f0f0;
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
	.footer {
  	position: fixed;
  	left: 0;
  	bottom: 0;
  	width: 100%;
  	color: white;
  	font-family:Arial, Helvetica;
  	font-size: 14px;
	background-color:#6e6e6e;
	}
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
	input[type=password],select,textarea{
	width: 100%;
	padding: 12px;
	border: 1px solid #ccc;
	border-radius: 4px;
	box-sizing: border-box;
	margin-top: 6px;
	margin-bottom: 16px;
	resize:  vertical;
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
	resize:  vertical;
	transition-duration: 0.4s;
	}
	input[type=submit]:hover{
	background-color: #3399ff;
	}
	.container{
	border-radius: 5px;
	background-color: white;
	padding: 10px;
	width: 400px;
	margin-left: 420px;
	margin-top: 20px;
	}
	.a1:link{
	text-decoration:none;
	color:white;
	}
	.a1:visited{
	text-decoration:none;
	color:white;
	}
	.a1:hover{
	text-decoration:none;
	color:white;
	}
	.a1:active{
	text-decoration:none;
	color:white;
	}
</style>
</head>
<div class="header">
	<div class="center"><h3><a class="a1" href="./index.jsp">Kwik Convenient Store</a></h3></div>	
</div>
<div class="topnav">
  <a href="#about">About</a>
  <a href="#contact">Contact</a>
  <a href="#detail">Detail</a>
  <a href="#service">Service</a>
</div>
<div class="footer">
  <img style="position:absolute;left:1050px;top:10px;width:32px;height:32px;" 
  src="E:\Fresh Start\Java and DB program\Project\Project3\src\fb-logo-white.png">
  <img style="position:absolute;left:1050px;top:50px;width:32px;height:32px;" 
  src="E:\Fresh Start\Java and DB program\Project\Project3\src\twitter-256.png"> 
  <img style="position:absolute;left:1050px;top:90px;width:32px;height:32px;" 
  src="E:\Fresh Start\Java and DB program\Project\Project3\src\ig-white.png">
  <p style="margin-left:70px;">Email :cs@kwik.com</p>
  <p style="margin-left:70px;">Phone:(0322)31245323</p>
  <p style="margin-left:70px;">Address:Jl. Basuki Rahmat No.4</p>
  <p style="margin-left:125px;">Lamongan, Jawa Timur</p>
</div> 
<body>
<div class="container">
<form action="./adminlogin" method="post">
	<h3>Admin Login</h3>
	<p>User name</p>
	<input type="text" id="uname" name="uname"/>
	<br/><br/>
	<p>Password</p>
	<input type="password" id="password" name="password"/>
	<br/><br/>
	<input type="submit" value="Login">
	</form>
</div>
<br/><br/><br/>
<br/><br/><br/>
<br/><br/><br/>
</body>
</html>