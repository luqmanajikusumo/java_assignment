package com.dao;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.model.DataModel;

public class DataComplement3 {
	public static void datacomplement(DataModel datamodel, String id) throws ClassNotFoundException{
		String sql = "select name,comment from userrecord where id='"+id+"'";
		Class.forName("com.mysql.cj.jdbc.Driver");
		try{
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/project2","root","root");
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				String name = rs.getString("name");
				String comment = rs.getString("comment");
				datamodel.setName(name);
				datamodel.setComment(comment);
			}
			connection.close();
		} catch (SQLException se) {
			se.printStackTrace();
		}
	}
}
