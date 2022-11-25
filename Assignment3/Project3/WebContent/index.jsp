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
	.button1{
	background-color: #0073e6;
	color: white;
	border: none;
	border-radius: 4px;
	cursor: pointer;
	position: absolute;
	top:200px;
	left:580px;
	font-size: 16px;
	width: 10%;
	padding: 12px;
	box-sizing: border-box;
	resize:  vertical;
	transition-duration: 0.4s;
	}
	.button1:hover{
	background-color: #3399ff;
	}
	.button2{
	background-color: #0073e6;
	color: white;
	border: none;
	border-radius: 4px;
	cursor: pointer;
	position: absolute;
	top:260px;
	left:580px;
	font-size: 16px;
	width: 10%;
	padding: 12px;
	box-sizing: border-box;
	resize:  vertical;
	transition-duration: 0.4s;
	}
	.button2:hover{
	background-color: #3399ff;
	}
	.button3{
	background-color: #0073e6;
	color: white;
	border: none;
	border-radius: 4px;
	cursor: pointer;
	position: absolute;
	top:320px;
	left:580px;
	font-size: 16px;
	width: 10%;
	padding: 12px;
	box-sizing: border-box;
	resize:  vertical;
	transition-duration: 0.4s;
	}
	.button3:hover{
	background-color: #3399ff;
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
  src="E://Fresh Start/Java and DB program/Project/Project3/src/fb-logo-white.png">
  <img style="position:absolute;left:1050px;top:50px;width:32px;height:32px;" 
  src="E://Fresh Start/Java and DB program/Project/Project3/src/twitter-256.png"> 
  <img style="position:absolute;left:1050px;top:90px;width:32px;height:32px;" 
  src="E://Fresh Start/Java and DB program/Project/Project3/src/ig-white.png">
  <p style="margin-left:70px;">Email :cs@kwik.com</p>
  <p style="margin-left:70px;">Phone:(0322)31245323</p>
  <p style="margin-left:70px;">Address:Jl. Basuki Rahmat No.4</p>
  <p style="margin-left:125px;">Lamongan, Jawa Timur</p>
</div> 
</head>
<body>
<button class="button1" onclick="document.location='./adminlogin.jsp'">Admin Login</button>
<button class="button2" onclick="document.location='./userlogin.jsp'">User Login</button>
<button class="button3" onclick="document.location='./registration.jsp'">New User? Register!</button>
</body>
</html>