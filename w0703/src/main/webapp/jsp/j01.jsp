<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>스크립트릿</title>
	</head>
	<body>
	   <!-- 스크립트릿 -->
	   <%
	     for(int i=1;i<=9;i++){
	    	 out.println("<h3> 2 * "+i+"="+(2*i)+"</h3>");
	    	 out.println("-------------------<br>");
	     }
	   
	     /* int i = 0;
	     while(true){
	    	 i++;
	    	 out.println("2 * "+ i + "=" + (2*i) + "<br>");
	    	 if(i>=9) break;
	     } */
	     
	   %>
	
	</body>
</html>