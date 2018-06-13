<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="org.c3.util.*"%> 
   
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
	String userName = SessionHelper.getUser(request);
	if(userName == null) {
		System.out.println("occured");
		RequestDispatcher rd = request.getRequestDispatcher("/error.jsp");
		rd.forward(request, response);
	}
%> 

	<h1>Hello you have the access!!</h1>
	<form action="logout">
		<input type="submit" value="logout">
	
	</form>
	
	<%-- <%http://localhost:8080/HelloWorld/helloworld.jsp %>
	<a href="https://uaa.bosh-lite.com/logout.do">Bye</a> --%>
</body>
</html>