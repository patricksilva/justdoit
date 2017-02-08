package com.company.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorldServlet
 */
@WebServlet("/authHelloWorldServlet")
public class HelloWorldServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public HelloWorldServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
    	PrintWriter out = response.getWriter();
    	out.println("<html>\r\n\t<head><title>Hello World Servlet!</title></head>\r\n");
    	out.println("\t<body>Hello World : Request received by GET\r\n<br />Actual Date: " +
    			new java.util.Date()
    			+ "</body>\r\n</html>");
    	System.out.println("Request sent by GET");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//doGet(request, response);
    	
    	String login = request.getParameter("login");
    	String password = request.getParameter("password");
    	
    	PrintWriter out = response.getWriter();
    	out.println("<html>\r\n\t<head><title>Hello World Servlet!</title></head>\r\n");
    	out.println("\t<body>Hello World : Request received by POST\r\n<br />Actual Date: " +
    			new java.util.Date()
    			+ "<h3>Form field values received via POST</h3>"
    			+ login +"<br>" + password
    			+ "</body>\r\n</html>");
    	System.out.println("Request sent by POST");
		
		System.out.println("Request send by POST");
	}

}
