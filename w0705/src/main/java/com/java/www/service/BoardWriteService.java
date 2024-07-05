package com.java.www.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.www.dao.BoardDao;

public class BoardWriteService implements BoardService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		BoardDao boardDao = new BoardDao();
		String btitle = request.getParameter("btitle");
		String bcontent = request.getParameter("bcontent");
		System.out.println("boardWriteService btitle : "+ btitle);
		System.out.println("boardWriteService bcontent : "+ bcontent);

		boardDao.listInsert(btitle,bcontent);
	}

}
