package com.ty;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
@WebServlet("/app")
public class s2  extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
	 int x1=Integer.parseInt(req.getParameter("n1"));
	 int x2=Integer.parseInt(req.getParameter("n2"));
	 int x3=x1*x2;
	 int sum=(int)req.getAttribute("SUM");
	 PrintWriter out=resp.getWriter();
	  out.println("<html><body bgcolor='yellow'>"+"<h1>UserDetails:"+sum+"from"+x3+"</h1>"+"</body></html>");
	}

}
