<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Citizen Information Center-Edit Record</title>
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
	input[type=submit]{
	background-color: #e66300;
	color: white;
	padding: 12px 20px;
	border: none;
	border-radius: 4px;
	cursor: pointer;
	margin-left:300px;
	margin-top:10px;
	font-size: 16px;
	}
	input[type=submit]:hover{
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
<h2 align="center">Edit Citizen Registration</h2>
<div class="container">
<form id="editdata" action="./code2" method="post" enctype='multipart/form-data'>
<input type="hidden" name="id" value="${datamodel.id}">
<label for="cname">Name</label>
<br>
<input type="text" id="cname" name="cname" value="${datamodel.name}">
<br><br>
<label for="cemail">Email</label>
<br>
<input type="text" id="cemail" name="cemail" value="${datamodel.email}">
<br><br>
<label for="caddress">Address</label>
<br>
<input type="text" id="caddress" name="caddress" value="${datamodel.address}">
<br><br>
<label for="cphone">Phone</label>
<br>
<input type="text" id="cphone" name="cphone" value="${datamodel.phone}">
<br><br>
<label for="ccity">City</label>
<br>
<input type="text" id="ccity" name="ccity" value="${datamodel.city}">
<br><br>
<label for="ccountry">Country</label>
<br>
<input type="text" id="ccountry" name="ccountry" value="${datamodel.country}">
<br><br>
<label for="cedu">Education</label>
<br>
<select name="cedu" id="cedu">
  <option selected="selected" value="${datamodel.education}"></option>
  <option value="Elementary_School">Elementary School</option>
  <option value="Junior_High_School">Junior High School</option>
  <option value="Senior_High_School">Senior High School</option>
  <option value="Diploma">Vocational School/Diploma</option>
  <option value="Bachelor">Bachelor Degree</option>
  <option value="Master">Master Degree</option>
  <option value="Doctoral">Doctoral Degree</option>
</select>
<br><br>
<label for="cphoto">Photo</label>
<br>
<input type="file" name="cphoto">
<br><br>
<input type="submit" value="Update">
</form>
</div>
<br><br><br><br>
<br><br>
<br><br>
</body>
</html>