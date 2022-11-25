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
	.button1{
	background-color: #0073e6;
	color: white;
	border: none;
	border-radius: 4px;
	cursor: pointer;
	position: absolute;
	top:200px;
	left:450px;
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
	top:200px;
	left:700px;
	font-size: 16px;
	width: 10%;
	padding: 16px;
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
	left:450px;
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
	.button4{
	background-color: #0073e6;
	color: white;
	border: none;
	border-radius: 4px;
	cursor: pointer;
	position: absolute;
	top:320px;
	left:700px;
	font-size: 16px;
	width: 10%;
	padding: 12px;
	box-sizing: border-box;
	resize:  vertical;
	transition-duration: 0.4s;
	}
	.button4:hover{
	background-color: #3399ff;
	}
	.button5{
	background-color: #0073e6;
	color: white;
	border: none;
	border-radius: 4px;
	cursor: pointer;
	position: absolute;
	top:20px;
	left:1100px;
	font-size: 16px;
	width: 10%;
	padding: 12px;
	box-sizing: border-box;
	resize:  vertical;
	transition-duration: 0.4s;
	}
	.button5:hover{
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
	<div class="center"><h3><a class="a1" href="./userdash.jsp">Kwik Convenient Store</a></h3></div>
	<a href="./index.jsp"><button class="button5">Log Out</button></a>	
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
	<div>
	<h3>Welcome: ${datamodel.name}</h3>
	<form action="./elproduct" method="post">
	<button class="button1">Electronic Product</button>
	</form>
	<form action="./fdproduct" method="post">
	<button class="button2">Food Product</button>
	</form>
	<form action="./eduproduct" method="post">
	<button class="button3">Education Product</button>
	</form>
	<form action="./medproduct" method="post">
	<button class="button4">Medical Product</button>
	</form>
	</div>
</body>
</html>