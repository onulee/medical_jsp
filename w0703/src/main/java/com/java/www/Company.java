package com.java.www;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/cp")
public class Company extends HttpServlet {
    
	protected void doAction(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doAction 실행함");
		request.setCharacterEncoding("utf-8"); //post방식 한글설정
		
		// form에서 넘어온 데이터 출력
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		String[] hobby = request.getParameterValues("hobby");
		
		System.out.println("id : "+id);
		System.out.println("pw : "+pw);
		System.out.println("name : "+name);
		System.out.println("gender : "+gender);
		System.out.println("hobby : "+Arrays.toString(hobby));
		
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter writer = response.getWriter();
		
		writer.println("<html>");
		writer.println("<head><title>회원정보</title></head>");
		writer.println("<body>");
		writer.println("<h2>[ 회원정보 ]</h2>");
		writer.println("<h3>아이디 : "+id+" </h3>");
		writer.println("<h3>패스워드 : "+pw+" </h3>");
		writer.println("<h3>이름 : "+name+" </h3>");
		writer.println("<h3>성별 : "+gender+" </h3>");
		writer.println("<h3>취미 : "+Arrays.toString(hobby)+" </h3>");
		writer.println("</body>");
		writer.println("</html>");
		
		
		writer.close();
	}
	
    
	// method가 get방식으로 들어오면 doGet() 호출
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("get방식으로 들어오면 실행을 시켜줍니다.");
		doAction(request, response);
	}

	// method가 post방식으로 들어오면 doPost() 호출
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("post방식으로 들어오면 실행을 시켜줍니다.");
		doAction(request, response);
		
	}

}
