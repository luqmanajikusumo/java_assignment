package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.UserForwarder;
import com.model.Model2;

/**
 * Servlet implementation class Controller2Helper
 */
public class Controller2Helper extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			String uname = request.getParameter("uname");
			String name = request.getParameter("name");
			Model2 datamodel = new Model2();
			datamodel.setUname(uname);
			datamodel.setName(name);	
			try {
				UserForwarder.uforwarder(datamodel,uname);
			}catch (Exception e) {
				e.printStackTrace();
			}
			request.setAttribute("datamodel", datamodel);
			request.getRequestDispatcher("/userdash.jsp").include(request, response);
	}

}
