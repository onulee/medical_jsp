<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>표현식</title>
	</head>
	<body>
	  <%!
	     int i = 10;
	     String str = "abc";
	     
	     private int sum(int a,int b){
	    	 return a+b;
	     }
	  %>
	  
	  <%
	     out.println("i : "+i);
	  %>
	  
	  <h3><%= i %></h3>
	  <h3><%= str %></h3>
	  <h3><%= sum(1,5) %></h3>
	
	</body>
</html>