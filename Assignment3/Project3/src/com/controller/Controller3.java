package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.AdminLogin;
import com.model.Model2;

/**
 * Servlet implementation class Controller3
 */
public class Controller3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	// TODO Auto-generated method stub
		String username = request.getParameter("uname");
		String password = request.getParameter("password");
		Model2 datamodel = new Model2();
		datamodel.setUname(username);
		datamodel.setPass(password);
		try {
			if(AdminLogin.loginadmin(datamodel)) {
				request.setAttribute("datamodel", datamodel);
				RequestDispatcher dispatcher = request.getRequestDispatcher("admindash.jsp");
				dispatcher.forward(request, response);
			}else {
				RequestDispatcher dispatcher = request.getRequestDispatcher("adminlogin.jsp");
				dispatcher.include(request, response);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
