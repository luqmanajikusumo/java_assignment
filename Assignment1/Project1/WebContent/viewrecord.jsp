<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%
String id = request.getParameter("userid");
String driver = "com.mysql.cj.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String database = "project1";
String userid = "root";
String password = "root";
try {
Class.forName(driver);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Citizen Information Center-View Record</title>
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
	width: 800px;
	margin-left: 250px;
	}
	th, td {
  	padding-top: 10px;
  	padding-bottom: 20px;
  	padding-left: 25px;
  	padding-right: 40px;
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
<h2 align="center">Citizen Record</h2>
<div class="container">
<table>
  <tr>
    <th>ID</th>
    <th>Date</th>
    <th>Name</th>
    <th>City</th>
    <th>Status</th>
    <th>Operation</th>
  </tr>
  <%
try{
connection = DriverManager.getConnection(connectionUrl+database, userid, password);
statement=connection.createStatement();
String sql ="select id, date_register, name, city from registrationtable";
resultSet = statement.executeQuery(sql);
while(resultSet.next()){	
  %>
  <tr>
    <td><%=resultSet.getString("id")%></td>
    <td><%=resultSet.getString("date_register")%></td>
    <td><%=resultSet.getString("name")%></td>
    <td><%=resultSet.getString("city")%></td>
    <td>
    <form action="./code5" method="post">
    <input type="hidden" name="id" value="<%=resultSet.getString("id") %>">
    <button>Profile</button><br>
    </form>
    </td>
    <td>
    <form action="./code4" method="post">
    <input type="hidden" name="id" value="<%=resultSet.getString("id") %>">
    <button>Edit</button><br>
    </form>
    <form action="./code3" method="post">
    <input type="hidden" name="id" value="<%=resultSet.getString("id") %>">
    <button>Delete</button>
    </form>
    </td>
  </tr>
<%
}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}
%>
</table>
</div>
<br><br><br><br>
</body>
</html>