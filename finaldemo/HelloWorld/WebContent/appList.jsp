<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">

function redirecturl(url)
{
	window.location= url;
}

</script>
</head>
<body>
	
	<%
		List<String> appList = (List<String>) session.getAttribute("appList");
		for(String name : appList) {
			String url = "http://" + name + ".bosh-lite.com/";
			System.out.println(url);
			
	%>
		<a href="#" onClick ="redirecturl('<%=url%>')"><%= name %> </a> <br>
		<%
			}
		%>
</body>
</html>