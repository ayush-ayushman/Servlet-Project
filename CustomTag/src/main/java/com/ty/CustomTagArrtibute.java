package com.ty;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.TagSupport;

public class CustomTagArrtibute extends TagSupport{
	int n;
	String st;
	

	public String getSt() {
		return st;
	}



	public void setSt(String st) {
		this.st = st;
	}



	public void setN(int n) {
		this.n = n;
	}

	JspWriter out=pageContext.getOut(); 

	@Override
	public int doStartTag() throws JspException {
		try {
			out.println("<div style='st:"+st+" '>");
			out.println("<br>");
			
			  for(int i=1;i<=10;i++)
			  {
				  
				  out.println((i*n) +"<br>");
			  }
			  out.println("</div>");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		return SKIP_BODY;
	}

}
