package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.TotalElectronic;
import com.model.Model2;

/**
 * Servlet implementation class Controller10
 */
public class Controller10 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			String [] elec = request.getParameterValues("elec"); 
			String name = request.getParameter("name");
			String [] price2 = request.getParameterValues("price2");
			Model2 datamodel = new Model2();
			datamodel.setName(name);
			datamodel.setPrice2(price2);
			datamodel.setElec(elec);
			try {
				TotalElectronic.totalelec(datamodel, elec, price2);
			}catch (Exception e) {
				e.printStackTrace();
			}
			response.sendRedirect("billinfo3.jsp"); 
	}

}
