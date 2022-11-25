package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.UserDataViewer;
import com.model.Model2;

/**
 * Servlet implementation class Controller12Helper
 */
public class Controller12Helper extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String uname = request.getParameter("uname");	
		String pass = request.getParameter("pass");
		String fname = request.getParameter("firstname");
		String lname = request.getParameter("lastname");
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
			UserDataViewer.showuserdata(datamodel,uname);
		}catch (Exception e) {
			e.printStackTrace();
		}
		request.setAttribute("datamodel", datamodel);
		request.getRequestDispatcher("/edituser.jsp").include(request, response);
	}

}
