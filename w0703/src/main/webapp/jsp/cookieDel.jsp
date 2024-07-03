<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>쿠키삭제 확인</title>
	</head>
	<body>
	  <%
	    Cookie[] cookies = request.getCookies();
	    if(cookies != null){
	    	for(Cookie cookie:cookies){
	    		out.println("찾은 쿠키 : "+cookie.getValue()+"<br>");
	    	}
	    }
	  %>
	  
	  <a href="cookieSave.jsp">쿠키 저장하기</a>
	
	</body>
</html>