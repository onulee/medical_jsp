<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("utf-8"); 
   String[] hobby = request.getParameterValues("hobby");
%>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>회원정보</title>
		<style>
		  table,th,td{border:1px solid black; border-collapse: collapse;}
		  th{width:120px;}
		</style>
	</head>
	<body>
	
	<h2>회원정보</h2>
	<%
	   Enumeration enums = request.getParameterNames();
	   while(enums.hasMoreElements()){
		    String sname = (String)enums.nextElement();
		    out.println("변수명 : "+ sname+"<br>");
	   }
	
	
	%>
	
	</body>
</html>