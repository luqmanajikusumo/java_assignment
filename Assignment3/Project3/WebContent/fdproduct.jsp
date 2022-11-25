<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome to Food Section</title>
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
	width: 600px;
	margin-left: 350px;
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
	th, td {
  	padding-top: 10px;
  	padding-bottom: 20px;
  	padding-left: 10px;
  	padding-right: 40px;
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
<h3>Welcome to the Food Section</h3>
<div class="container">
<form action="./totalfood" method="post">
<table>
  <tr>
    <th>ID</th>
    <th>Name</th>
    <th>Image</th>
    <th>Price (Rp)</th>
  </tr>
  <tr>
    <td>${datamodel.id=1}</td>
    <td>${datamodel.name='Fried Rice'}</td>
    <td><img style="width:150px;height:150px;" 
  src="E:/Fresh Start/Java and DB program/Project/Project3/src/${datamodel.name}.jpg"></td>
    <td>${datamodel.price=15000}</td>
    <td><input type="checkbox" id="food" name="food" value="${datamodel.name='Fried Rice'}"></td>
    <td><input type="hidden" id="price2" name="price2" value="${datamodel.price=15000}"></td>
  </tr>
  <tr>
    <td>${datamodel.id=2}</td>
    <td>${datamodel.name='Meatball Soup'}</td>
    <td><img style="width:150px;height:150px;" 
  src="E:/Fresh Start/Java and DB program/Project/Project3/src/${datamodel.name}.jpg"></td>
    <td>${datamodel.price=10000}</td>
    <td><input type="checkbox" id="food" name="food" value="${datamodel.name='Meatball Soup'}"></td>
    <td><input type="hidden" id="price2" name="price2" value="${datamodel.price=10000}"></td>
  </tr>
  <tr>
    <td>${datamodel.id=3}</td>
    <td>${datamodel.name='Chicken Noodle'}</td>
    <td><img style="width:150px;height:150px;" 
  src="E:/Fresh Start/Java and DB program/Project/Project3/src/${datamodel.name}.jpg"></td>
    <td>${datamodel.price=12000}</td>
    <td><input type="checkbox" id="food" name="food" value="${datamodel.name='Chicken Noodle'}"></td>
    <td><input type="hidden" id="price2" name="price2" value="${datamodel.price=12000}"></td>
  </tr>
  <tr>
    <td>${datamodel.id=4}</td>
    <td>${datamodel.name='Rawon'}</td>
    <td><img style="width:150px;height:150px;" 
  src="E:/Fresh Start/Java and DB program/Project/Project3/src/${datamodel.name}.jpg"></td>
    <td>${datamodel.price=15000}</td>
    <td><input type="checkbox" id="food" name="food" value="${datamodel.name='Rawon'}"></td>
    <td><input type="hidden" id="price2" name="price2" value="${datamodel.price=15000}"></td>
  </tr>
  <tr>
    <td>${datamodel.id=5}</td>
    <td>${datamodel.name='Soto Lamongan'}</td>
    <td><img style="width:150px;height:150px;" 
  src="E:/Fresh Start/Java and DB program/Project/Project3/src/${datamodel.name}.jpg"></td>
    <td>${datamodel.price=15000}</td>
    <td><input type="checkbox" id="food" name="food" value="${datamodel.name='Soto Lamongan'}"></td>
    <td><input type="hidden" id="price2" name="price2" value="${datamodel.price=15000}"></td>
  </tr>
  <tr>
    <td>${datamodel.id=6}</td>
    <td>${datamodel.name='Juice'}</td>
    <td><img style="width:150px;height:150px;" 
  src="E:/Fresh Start/Java and DB program/Project/Project3/src/${datamodel.name}.jpg"></td>
    <td>${datamodel.price=5000}</td>
    <td><input type="checkbox" id="food" name="food" value="${datamodel.name='Juice'}"></td>
    <td><input type="hidden" id="price2" name="price2" value="${datamodel.price=5000}"></td>
  </tr>
  <tr>
    <td>${datamodel.id=7}</td>
    <td>${datamodel.name='Iced Young Coconut'}</td>
    <td><img style="width:150px;height:150px;" 
  src="E:/Fresh Start/Java and DB program/Project/Project3/src/${datamodel.name}.jpg"></td>
    <td>${datamodel.price=5000}</td>
    <td><input type="checkbox" id="food" name="food" value="${datamodel.name='Iced Young Coconut'}"></td>
    <td><input type="hidden" id="price2" name="price2" value="${datamodel.price=5000}"></td>
  </tr>
  <tr>
    <td>${datamodel.id=8}</td>
    <td>${datamodel.name='Coffee'}</td>
    <td><img style="width:150px;height:150px;" 
  src="E:/Fresh Start/Java and DB program/Project/Project3/src/${datamodel.name}.jpg"></td>
    <td>${datamodel.price=3000}</td>
    <td><input type="checkbox" id="food" name="food" value="${datamodel.name='Coffee'}"></td>
    <td><input type="hidden" id="price2" name="price2" value="${datamodel.price=3000}"></td>
  </tr>
  <tr>
  <td><button>Submit</button></td>
  </tr>
</table>
</form>
</div>
<br><br><br><br>
<br><br><br><br>
<br><br><br><br>
</body>
</html>