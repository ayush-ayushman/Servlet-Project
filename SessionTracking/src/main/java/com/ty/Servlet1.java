package com.ty;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
@WebServlet("/first")
public class Servlet1 extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		String st=req.getParameter("nm");
		 PrintWriter out=resp.getWriter();
		// out.println("<html><body bgcolor='yellow'>"+"<h1>Hello:"+st+"</h1>"+"</body></html>");
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Hello,"+st+" </h1>");
		Cookie c=new Cookie("username",st);
		resp.addCookie(c); 
		out.println("<h1><a href='action'>click here</a></h1>");
		
		out.println("</body>");
		out.println("</html>");
		
	}

}