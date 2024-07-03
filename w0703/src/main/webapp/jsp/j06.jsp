<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>response객체</title>
	</head>
	<body>
	  <h2>나이를 입력하세요.</h2>
	  <form action="doPass.jsp" method="get" >
	    <label>이름</label>
	    <input type="text" name="name" placeholder="이름을 입력하세요.">
	    <br>
	    <label>나이</label>
	    <input type="text" name="age" placeholder="나이를 입력하세요.">
	    <br>
	    <input type="submit" value="전송">
	  </form>
	
	</body>
</html>