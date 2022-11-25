package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.UserLogin;
import com.model.Model2;

/**
 * Servlet implementation class Controller2
 */
public class Controller2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String uname = request.getParameter("uname");
		System.out.println(uname);
		String password = request.getParameter("password");
		System.out.println(password);
		Model2 datamodel = new Model2();
		datamodel.setUname(uname);
		datamodel.setPass(password);
		try {
			if(UserLogin.loginuser(datamodel)) {
				request.setAttribute("datamodel", datamodel);
				RequestDispatcher dispatcher = request.getRequestDispatcher("./forwarder");
				dispatcher.forward(request, response);
			}else {
				RequestDispatcher dispatcher = request.getRequestDispatcher("userlogin.jsp");
				dispatcher.include(request, response);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
