package com.java.www.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.www.dao.BoardDao;
import com.java.www.dto.Board;

public class BoardModifyService implements BoardService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		int bno = Integer.parseInt(request.getParameter("bno"));
		System.out.println("bno : "+bno);
		BoardDao boardDao = new BoardDao();
		Board board = boardDao.selectOne(bno);
		request.setAttribute("board", board);

	}

}
