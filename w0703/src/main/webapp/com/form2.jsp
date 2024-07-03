<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>안녕</title>
	</head>
	<body>
	  <h2>성적처리프로그램</h2>
	  <form action="../cp2" method="post">
	    <label>이름</label>
	    <input type="text" name="name"><br>
	    <label>국어</label>
	    <input type="text" name="kor"><br>
	    <label>영어</label>
	    <input type="text" name="eng"><br>
	    <label>수학</label>
	    <input type="text" name="math"><br>
	    
	    <br>
	    
	    
	    <input type="submit" value="전송">
	  
	  </form>
	
	</body>
</html>