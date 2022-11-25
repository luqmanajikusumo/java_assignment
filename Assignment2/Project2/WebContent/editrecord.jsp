<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Record</title>
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
	td {
  	left:500px;
  	position:relative;
	}
	.container{
	border-radius: 5px;
	background-color: white;
	padding: 40px;
	width: 400px;
	margin-left: 380px;
	margin-top: 90px;
	}
	td {
  	left:380px;
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
<form action="./code5" method="post" enctype='multipart/form-data'>
<input type="hidden" name="id" value="${datamodel.id}">
<div class="container">
<h3>Edit Record</h3>
<label for="txtfile">Text File</label>
<br>
<input type="file" id="txtfile" name="txtfile" accept=".txt">
<br><br>
<label for="comment">Comment</label>
<br>
<textarea id="comment" name="comment" rows="4" cols="50">
Your comment...
</textarea>
<br><br>
<br><br>
<input type="submit" value="Submit">
</div>
<br><br>
</form>
</body>
</html>