package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.UserEdit;
import com.model.Model2;

/**
 * Servlet implementation class Controller12
 */
public class Controller12 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String uname = request.getParameter("uname");	
		String pass = request.getParameter("pass");
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String address = request.getParameter("address");	
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		Model2 datamodel = new Model2();
		datamodel.setUname(uname);
		datamodel.setPass(pass);	
		datamodel.setFirstName(fname);
		datamodel.setLastName(lname);
		datamodel.setAddress(address);	
		datamodel.setPhone(phone);
		datamodel.setEmail(email);
		try {
			UserEdit.edituser(datamodel);
		}catch (Exception e) {
			e.printStackTrace();
		}
		response.sendRedirect("viewrecord.jsp");
	}

}
