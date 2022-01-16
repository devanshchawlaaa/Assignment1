package com.org.reqDisp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletOne
 */
@WebServlet("/ServletOne")
public class ServletOne extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	response.setContentType("text/html");
	PrintWriter pw = response.getWriter();
	String uname = request.getParameter("val1");
	String uid = request.getParameter("val2");
	String upass = request.getParameter("val3");
	
	if(upass.equals("abc")){
		RequestDispatcher Rd = request.getRequestDispatcher("Display1");
		Rd.forward(request, response);
	}else {
		pw.println("Incorrect userid or password");
		RequestDispatcher Rd = request.getRequestDispatcher("/forward.html");
		Rd.include(request, response);
	}
	
	
	}

}
