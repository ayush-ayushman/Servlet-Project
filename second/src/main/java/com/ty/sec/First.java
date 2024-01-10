package com.ty.sec;
@WebServlet("/fs")
public class First extends GenericServlet{
	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
	  String name=req.getParameter("nm");
	  String place=req.getParameter("pl");
	  PrintWriter out=resp.getWriter();
	  out.println("<html><body bgcolor='yellow'>"+"<h1>UserDetails:"+name+"from"+place+"</h1>"+"</body></html>");
	  out.close();
		
	}
}


