<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <h1>Hello</h1>
 <%!
    int x=5;
    int y=10;
    public int sm()
    {
    	int z=x+y;
    	return z;
    }
 %>
  <%
     out.println(x);
     out.println(y);
     int z=sm();
     out.println(z);
  %>
  <%=x %>
  <%=y %>
  <%=sm()%>
</body>
</html>