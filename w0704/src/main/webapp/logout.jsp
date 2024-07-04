<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	   
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>로그인체크</title>
		<script>
		   <% session.invalidate(); //섹션 모두 제거 %>
		   <%-- session.removeAttribute("sessionId"); //섹션 1개만 제거 --%>
		   alert("로그아웃이 되었습니다.");
		   location.href = "index.jsp";
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