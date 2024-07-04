<%@page import="java.io.ObjectInputStream.GetField"%>
<%@page import="java.util.Enumeration"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>파일업로드</title>
	</head>
	<body>
	  <%
	    //String uploadPath = request.getRealPath("upload"); //서버위치
	    String uploadPath = "C:/upload"; //서버로컬위치 
	    int size = 10*1024*1024; //10mb
	    
	    //String id = request.getParameter("id");
	    
	    MultipartRequest multi = new MultipartRequest(request,uploadPath,size,"utf-8",new DefaultFileRenamePolicy());
	    String id = multi.getParameter("id");
	    /* 여러개 파일이름 가져오기*/
	    Enumeration files = multi.getFileNames();
	    String file = (String) files.nextElement();  //name="profile"
	    String fileName = multi.getFilesystemName(file);
	    
	    out.println("아이디 : "+id+"<br>");
	    out.println("파일이름 : "+fileName+"<br>");
	    
	  
	  %>
	
	</body>
</html>