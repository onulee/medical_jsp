<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>cookie save</title>
	</head>
	<body>
	<%
	   //쿠키생성
	   Cookie cookie = new Cookie("c_id","aaa");
	   Cookie cookie2 = new Cookie("c_pw","1111");
	   
	   //쿠키 시간 설정
	   cookie.setMaxAge(60*10); //60초*10분 = 10분
	   cookie2.setMaxAge(60*5);  //60초*5분 = 5분
	   
	   // 로컬에 저장
	   response.addCookie(cookie);
	   response.addCookie(cookie2);
	   
	%>
	<h2>쿠키가 저장되었습니다.</h2>
	<a href="cookieRead.jsp">페이지 이동</a>
	
	</body>
</html>