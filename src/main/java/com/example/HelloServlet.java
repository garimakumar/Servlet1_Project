package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	out.println("<h1>This is H1 tag</h1>");
	out.println("<h2>This is H2 tag</h2>");
	out.println("<h3>This is H3 tag</h3>");
	out.println("<h4>This is H4 tag</h4>");
	out.flush();
	out.close();
	
	}

}
