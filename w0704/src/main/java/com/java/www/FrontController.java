package com.java.www;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("*.do") //확장자패턴
public class FrontController extends HttpServlet {
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doAction");
		String url = null;
		String uri = request.getRequestURI(); //
		String contextPath = request.getContextPath();
		String fileName = uri.substring(contextPath.length());
		MemberDao memberDao = null;
		
		System.out.println("파일이름 : "+fileName);
		
		if(fileName.equals("/login.do")) {
			response.sendRedirect("login.jsp");
		}else if(fileName.equals("/member.do")) {
			ArrayList<MemberDto> list = memberDao.doMember();
			request.setAttribute("list", list);
		}
		
		
	}
	
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
		doAction(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");
		doAction(request, response);
	}

}
