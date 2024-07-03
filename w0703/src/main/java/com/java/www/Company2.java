package com.java.www;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/cp2")
public class Company2 extends HttpServlet {
	
	static int count = 1;
	
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doAction");
		request.setCharacterEncoding("utf-8");
		String stuNo2 = "S"+String.format("%04d", count++);
		String stuNo = "S0001";
		String name = request.getParameter("name");
		int kor = Integer.parseInt(request.getParameter("kor"));
		int eng = Integer.parseInt(request.getParameter("eng"));
		int math = Integer.parseInt(request.getParameter("math"));
		int total = kor+eng+math;
		double avg = total/3.0;
		System.out.println("학번 : "+stuNo);
		System.out.println("학번2 : "+stuNo2);
		System.out.println("이름 : "+name);
		System.out.println("국어 : "+kor);
		System.out.println("영어 : "+eng);
		System.out.println("수학 : "+math);
		System.out.println("합계 : "+total);
		System.out.println("평균 : "+avg);
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter writer = response.getWriter();
		
		writer.println("<html>");
		writer.println("<head><title>학생성적프로그램</title></head>");
		writer.println("<body>");
		writer.println("<h2>[ 학생성적정보 ]</h2>");
		writer.println("<h3>학번 : "+stuNo+" </h3>");
		writer.println("<h3>이름 : "+name+" </h3>");
		writer.println("<h3>국어 : "+kor+" </h3>");
		writer.println("<h3>영어 : "+eng+" </h3>");
		writer.println("<h3>수학 : "+math+" </h3>");
		writer.println("<h3>합계 : "+total+" </h3>");
		writer.println("<h3>평균 : "+avg+" </h3>");
		writer.println("</body>");
		writer.println("</html>");
		
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
		doAction(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");
		doAction(request,response);
	}

}
