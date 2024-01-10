package com.ty;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
@WebServlet("/s1")
public class s1 extends GenericServlet  {

	
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		String n1=req.getParameter("n1");
		String n2=req.getParameter("n2");
		int op1=Integer.parseInt(n1);
		int op2=Integer.parseInt(n2);
		int sum=op1+op2;
		req.setAttribute("SUM",sum);
		RequestDispatcher re=req.getRequestDispatcher("app");
		re.forward(req, resp);
		
		
	}
	
}