<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>forward</title>
	</head>
	<body>
	<%
	   RequestDispatcher dispatcher = request.getRequestDispatcher("forward2.jsp");
	   dispatcher.forward(request, response);
	%>
	<%--
	  <%
	    response.sendRedirect("forward2.jsp");
	  %>
	 --%>
	
	
	</body>
</html>