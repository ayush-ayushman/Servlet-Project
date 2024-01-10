package com.ty;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
@WebServlet("/second")
public class ServletTwo extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
	   String st=req.getParameter("user");
	   PrintWriter out=resp.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Hello,"+st+" </h1>");
		out.println("</body>");
		out.println("</html>");
		
	}

}
