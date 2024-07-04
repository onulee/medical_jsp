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
	<table>
	   <tr>
	     <th>제목</th>
	     <th>내용</th>
	   </tr>
	   <tr>
	     <td>아이디</td>
	     <td>${param.id }</td>
	   </tr>
	   <tr>
	     <td>패스워드</td>
	     <td>${param.pw }</td>
	   </tr>
	   <tr>
	     <td>이름</td>
	     <td>${param.name }</td>
	   </tr>
	   <tr>
	     <td>성별</td>
	     <td>${param.gender }</td>
	   </tr>
	   <tr>
	     <td>취미</td>
	     <td>${paramValues.hobby[0] }</td>
	   </tr>
	   <tr>
	     <td>취미</td>
	     <td>${paramValues.hobby[1] }</td>
	   </tr>
	   
	   
	  
	
	</table>
	
	</body>
</html>