package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.UserProfile;
import com.model.Model2;

/**
 * Servlet implementation class Controller13
 */
public class Controller13 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  	// TODO Auto-generated method stub
  			String uname = request.getParameter("uname");	
  			String pass = request.getParameter("pass");
  			String name = request.getParameter("name");
  			String address = request.getParameter("address");	
  			String phone = request.getParameter("phone");
  			String email = request.getParameter("email");
  			Model2 datamodel = new Model2();
  			datamodel.setUname(uname);
  			datamodel.setPass(pass);	
  			datamodel.setName(name);
  			datamodel.setAddress(address);	
  			datamodel.setPhone(phone);
  			datamodel.setEmail(email);
  			try {
  				UserProfile.userprofile(datamodel,uname);
  			}catch (Exception e) {
  				e.printStackTrace();
  			}
  			request.setAttribute("datamodel", datamodel);
  			request.getRequestDispatcher("/userprofile.jsp").include(request, response);
  	}

}
