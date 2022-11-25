<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit User Information</title>
<style>
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
	input[type=file],select,textarea{
	width: 100%;
	padding: 12px;
	border: 1px solid #ccc;
	border-radius: 4px;
	box-sizing: border-box;
	margin-top: 6px;
	margin-bottom: 16px;
	resize:  vertical;
	background-color: white;
	}
	input[type=submit]{
	background-color: #0073e6;
	color: white;
	padding: 12px 20px;
	border: none;
	border-radius: 4px;
	cursor: pointer;
	margin-left:270px;
	margin-top:10px;
	font-size: 16px;
	transition-duration: 0.4s;
	}
	input[type=submit]:hover{
	background-color: #3399ff;
	}
	.container{
	border-radius: 5px;
	background-color: white;
	padding: 30px;
	width: 700px;
	margin-left: 290px;
	}
</style>
</head>
<body>
<h2 align="center">Edit User</h2>
<div class="container">
<form action="./code9" method="post" enctype='multipart/form-data'>
<h3>User Credential</h3>
<br>
<label for="name">Name</label>
<br>
<input type="text" id="name" name="name" value="${datamodel.name}">
<br><br>
<label for="email">Email</label>
<br>
<input type="text" id="email" name="email" value="${datamodel.email}">
<br><br>
<label for="uname">User Name</label>
<br>
<input type="text" id="uname" name="uname" value="${datamodel.uname}">
<br><br>
<label for="password">Password</label>
<br>
<input type="password" id="password" name="password" value="${datamodel.pass}">
<br><br>
<label for="confpassword">Confirm Password</label>
<br>
<input type="password" id="confpassword" name="confpassword" value="${datamodel.pass}">
<br><br>
<label for="photo">Photo</label>
<br>
<img id="photo" alt="your image" width="100" height="100" />
<input type="file" id="photo" name="photo" accept=".jpg, .jpeg, .png" 
onchange="document.getElementById('photo').src = window.URL.createObjectURL(this.files[0])">
<br><br>
<h3>Personal Information</h3>
<br>
<label for="phone">Phone</label>
<br>
<input type="text" id="phone" name="phone" value="${datamodel.phone}">
<br><br>
<label for="address">Address</label>
<br>
<input type="text" id="address" name="address" value="${datamodel.address}">
<br><br>
<label for="city">City</label>
<br>
<input type="text" id="city" name="city" value="${datamodel.city}">
<br><br>
<label for="country">Country</label>
<br>
<input type="text" id="country" name="country" value="${datamodel.country}">
<br>
<input type="submit" value="Register">
</form>
</div>
<br><br>
</body>
</html>