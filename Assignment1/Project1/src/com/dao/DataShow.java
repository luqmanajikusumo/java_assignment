package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.model.DataModel;

public class DataShow {
	public static void showuser(DataModel datamodel, String id) throws ClassNotFoundException{
		String sql = "select id,name,email,address,phone,city,country,education from registrationtable where id="+id;
		Class.forName("com.mysql.cj.jdbc.Driver");
		try{
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/project1","root","root");
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				String cid = rs.getString("id");
				String cname = rs.getString("name");
				String cemail = rs.getString("email");
				String caddress = rs.getString("address");
				String cphone = rs.getString("phone");
				String ccity = rs.getString("city");
				String ccountry = rs.getString("country");
				String ceducation = rs.getString("education");
				datamodel.setId(cid);
				datamodel.setName(cname);
				datamodel.setEmail(cemail);
				datamodel.setAddress(caddress);
				datamodel.setPhone(cphone);
				datamodel.setCity(ccity);
				datamodel.setCountry(ccountry);
				datamodel.setEducation(ceducation);
			}
			connection.close();
		} catch (SQLException se) {
			se.printStackTrace();
		}
	}
}
