package com.info;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.DataLogin;
import com.model.DataModel;

/**
 * Servlet implementation class Servlet2
 */
public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("uname");
		String password = request.getParameter("password");
		DataModel datamodel = new DataModel();
		datamodel.setUname(username);
		datamodel.setPass(password);
		try {
			if(DataLogin.loginuser(datamodel)) {
				System.out.println("request is reached...");
				request.setAttribute("datamodel", datamodel);
				RequestDispatcher dispatcher = request.getRequestDispatcher("./code2h");
				dispatcher.forward(request, response);
			}else {
				RequestDispatcher dispatcher = request.getRequestDispatcher("login.html");
				dispatcher.include(request, response);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
