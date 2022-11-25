package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.model.Model;

public class EducationBill {
	public static void eduview(Model datamodel) throws ClassNotFoundException{
		String sql = "select id,name,orderdatetime,cost from eduselection";
		Class.forName("com.mysql.cj.jdbc.Driver");
		try{
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/project3","root","root");
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				String id = rs.getString("id");
				String name = rs.getString("name");
				String orderdatetime = rs.getString("orderdatetime");
				String price = rs.getString("cost");
				datamodel.setId(id);
				datamodel.setName(name);
				datamodel.setOrderDateTime(orderdatetime);
				datamodel.setPrice(price);
			}
			connection.close();
		} catch (SQLException se) {
			se.printStackTrace();
		}
	}
}
