package com.ty.first;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;




public class FirstServlet extends GenericServlet {
	public FirstServlet()
	{
		System.out.println("object has been created");
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		
		String name = arg0.getParameter("nm");
		String place = arg0.getParameter("pl");
		PrintWriter out = arg1.getWriter();
		out.println("<html><body>" + "<h1>" + name + "  "+  "from"  + place + "</h1>" + "</body></html>");
        System.out.println("service executed");
	}
	@Override
	public void init() throws ServletException {
		System.out.println("initialization done");
	}
	@Override
	public void destroy() {
		System.out.println("object destroy");
	}

}
