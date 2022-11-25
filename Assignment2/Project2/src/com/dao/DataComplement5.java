package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.model.DataModel;

public class DataComplement5 {
	public static void showuser(DataModel datamodel, String uname) throws ClassNotFoundException{
		String sql = "select name,email,address,phone,city,country from usertable where username='"+uname+"'";
		Class.forName("com.mysql.cj.jdbc.Driver");
		try{
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/project2","root","root");
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				String name = rs.getString("name");
				String email = rs.getString("email");
				String address = rs.getString("address");
				String phone = rs.getString("phone");
				String city = rs.getString("city");
				String country = rs.getString("country");
				datamodel.setName(name);
				datamodel.setEmail(email);
				datamodel.setAddress(address);
				datamodel.setPhone(phone);
				datamodel.setCity(city);
				datamodel.setCountry(country);
			}
			connection.close();
		} catch (SQLException se) {
			se.printStackTrace();
		}
	}
}
