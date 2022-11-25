package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.MedicalView;
import com.model.Model2;

/**
 * Servlet implementation class Controller7
 */
public class Controller7 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
				String id = request.getParameter("id");
				String name = request.getParameter("name");
				String price = request.getParameter("price");
				Model2 datamodel = new Model2();
				datamodel.setId(id);
				datamodel.setName(name);
				datamodel.setPrice(price);
									
				try {
					MedicalView.medview(datamodel);
				}catch (Exception e) {
					e.printStackTrace();
				}
				request.setAttribute("datamodel", datamodel);
				request.getRequestDispatcher("medproduct.jsp").include(request, response);
	}

}
