<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.Context"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>커넥션 풀</title>
		<style>
		  table,th,td{border:1px solid black; border-collapse: collapse;}
		  th,td{width:120px;}
		</style>
	</head>
	<body>
	<%!
	   Connection conn;
	   PreparedStatement pstmt;
	   ResultSet rs;
	%>
	
	<table>
	  <tr>
	    <th>아이디</th>
	    <th>패스워드</th>
	    <th>이름</th>
	    <th>번호</th>
	  </tr>
	<%
	  try{
		  //커넥션 풀 사용
		  Context context = new InitialContext();
		  DataSource ds = (DataSource) context.lookup("java:comp/env/jdbc/Oracle");
		  conn = ds.getConnection();
		  //
		  String query = "select * from member";
		  pstmt = conn.prepareStatement(query);
		  rs = pstmt.executeQuery();
		  while(rs.next()){
			  String id = rs.getString("id");
			  String pw = rs.getString("pw");
			  String name = rs.getString("name");
			  int no = rs.getInt("no");
		  %>
		  
		     <tr>
		       <td><%=id %></td>
		       <td><%=pw %></td>
		       <td><%=name %></td>
		       <td><%=no %></td>
		     </tr>
		  
		  
		  <%
			  //out.println(id+","+pw+","+name+","+no+"<br>");
		  }
		  
		  
	  }catch(Exception e){ e.printStackTrace();}
	  finally{
		  if(rs!=null) rs.close();
		  if(pstmt!=null) pstmt.close();
		  if(conn!=null) conn.close();
	  }
	%>
	</table>
	</body>
</html>