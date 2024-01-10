package org.jsp.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/fs")
public class FirstServlet extends GenericServlet {
	public FirstServlet()
	{
		System.out.println("Ayush Ayushman");
	}
	@Override
	public void service(ServletRequest req,ServletResponse resp) throws ServletException,IOException
	{
		String name=req.getParameter("nm");
		String place=req.getParameter("pl");
	    PrintWriter out=resp.getWriter();
	    out.println("<html><body bgcolor='red'>+"<h1>name</h1>""</body></html>");
	    out.close();
	}

}
