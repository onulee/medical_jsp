<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	   String id = request.getParameter("id");
	   String pw = request.getParameter("pw"); 
%>	   
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>로그인체크</title>
		<script>
		   if("<%=id%>" == "aaa" && "<%=pw%>" == "1111" ){
			   alert("로그인이 되었습니다.");
			   location.href = "index.jsp";
			   <% 
			     session.setAttribute("sessionId", id);
			   %>
		   }else{
			   alert("아이디 또는 패스워드가 일치하지 않습니다. 다시 로그인하세요.");
			   location.href = "login.jsp";
		   }
		</script>
		
	</head>
	<body>
	<%--
	   String id = request.getParameter("id");
	   String pw = request.getParameter("pw");
	   if(id.equals("aaa") && pw.equals("1111")){
	   
		   response.sendRedirect("index.jsp");
	   }else{
		   response.sendRedirect("login.jsp");
	   }
	--%>
	
	</body>
</html>