package com.controller;

import java.io.IOException;
//import java.util.Objects;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//import java.util.Arrays;
//import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.TotalEdu;
import com.model.Model2;

/**
 * Servlet implementation class Controller8
 */
public class Controller8 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String [] edu = request.getParameterValues("edu"); 
		String name = request.getParameter("name");
		String [] price2 = request.getParameterValues("price2");
		Model2 datamodel = new Model2();
		datamodel.setName(name);
		datamodel.setPrice2(price2);
		datamodel.setEdu(edu);
		try {
			TotalEdu.totaledu(datamodel, edu, price2);
		}catch (Exception e) {
			e.printStackTrace();
		}
		response.sendRedirect("billinfo.jsp"); 
		//request.getRequestDispatcher("billinfo.jsp").include(request, response);
	}

}
