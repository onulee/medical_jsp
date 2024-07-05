package com.java.www.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.java.www.dao.BoardDao;
import com.java.www.dao.MemberDao;
import com.java.www.dto.Board;
import com.java.www.dto.Member;

public class MemberLoginService implements MemberService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		System.out.println("id : "+id);
		
		MemberDao memberDao = new MemberDao();
		Member member = memberDao.selectLogin(id,pw);
		if(member != null) {
			//섹션저장
			HttpSession session = request.getSession();
			//session.setAttribute("sessionId", id);
			request.setAttribute("result", "1");
			System.out.println("result : 1");
		}else {
			request.setAttribute("result", "-1");
			System.out.println("result : -1");
			
		}

	}

}
