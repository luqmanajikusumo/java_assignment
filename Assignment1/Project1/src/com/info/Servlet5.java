package com.info;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.DataProfile;
import com.model.DataModel;

/**
 * Servlet implementation class Servlet2
 */
public class Servlet5 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = request.getParameter("id");
		String name = request.getParameter("cname");
		String email = request.getParameter("cemail");
		String address = request.getParameter("caddress");
		String phone = request.getParameter("cphone");
		String city = request.getParameter("ccity");
		String country = request.getParameter("ccountry");
		String education = request.getParameter("cedu");
		
		DataModel datamodel = new DataModel();
		datamodel.setId(id);
		datamodel.setName(name);
		datamodel.setEmail(email);
		datamodel.setAddress(address);
		datamodel.setPhone(phone);
		datamodel.setCity(city);
		datamodel.setCountry(country);
		datamodel.setEducation(education);
		
		try {
			DataProfile.userprofile(datamodel,id);
		}catch (Exception e) {
			e.printStackTrace();
		}
		request.setAttribute("datamodel", datamodel);
		request.getRequestDispatcher("profile.jsp").include(request, response);
	}

}
