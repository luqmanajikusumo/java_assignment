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
String database = "project2";
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
<title>View User Record</title>
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
	left:650px;
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
	th, td {
  	padding-top: 10px;
  	padding-bottom: 20px;
  	padding-left: 10px;
  	padding-right: 40px;
	}
	.container{
	border-radius: 5px;
	background-color: white;
	padding: 40px;
	width: 650px;
	margin-left: 290px;
	margin-top: 90px;
	}
</style>
</head>
<div class="header">
	<table>
	<tr>
	<td style="position:relative;left:380px;"><div style='width: 300px;'><h3>Welcome: ${datamodel.name}</h3></div></td>
	<td><img alt="User Picture" src="E:/Fresh Start/Java and DB program/Project/Project2/src/${datamodel.name}.jpg" style="width:50px;height:50px;position:relative;left:650px;"></td>
	<td>
	<a href="./login.html"><button class="button">Log Out</button></a></td>
	</tr>
	</table>
</div>
<body>
<div class="container">
<table>
  <tr>
    <th>ID</th>
    <th>Name</th>
    <th>Email</th>
    <th>File</th>
    <th>Operation</th>
  </tr>
  <%
try{
connection = DriverManager.getConnection(connectionUrl+database, userid, password);
statement=connection.createStatement();
String sql ="select id, name, email, file from userrecord";
resultSet = statement.executeQuery(sql);
while(resultSet.next()){	
  %>
  <tr>
    <td><%=resultSet.getString("id")%></td>
    <td><%=resultSet.getString("name")%></td>
    <td><%=resultSet.getString("email")%></td>
    <td><%=resultSet.getString("file")%></td>
    <td>
    <form action="./code5h" method="post">
    <input type="hidden" name="id" value="<%=resultSet.getString("id") %>">
    <button>Edit</button><br>
    </form>
    <form action="./code6" method="post">
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