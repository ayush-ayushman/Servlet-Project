package com.ty.first;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(urlPatterns="/fs", loadOnStartup=5)
public class First extends GenericServlet{
	public First()
	{
		System.out.println("Servlet Object Created");
	}
	@Override
	public void init(ServletConfig config)
	{
		System.out.println("Servlet object is initialization");
	}
	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
	  String name=req.getParameter("nm");
	  String place=req.getParameter("pl");
	  PrintWriter out=resp.getWriter();
	  out.println("<html><body bgcolor='yellow'>"+"<h1>UserDetails:"+name+"from"+place+"</h1>"+"</body></html>");
	  System.out.println("Service() is executed");
	  out.close();
		
	}
	public void distroy()
	{
		System.out.println("close all the costly resource");
	}

}
