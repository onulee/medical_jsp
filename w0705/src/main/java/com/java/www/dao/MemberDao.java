package com.java.www.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.java.www.dto.Board;
import com.java.www.dto.Member;

public class MemberDao {

	//db접근 정보
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	Member member;
	int memNo,no;
	String id,pw,name,gender;
	Timestamp mdate;
	ArrayList<Member> list = new ArrayList<Member>();
	String query;
	
	
	
	//회원 로그인 메소드
	public Member selectLogin(String id, String pw) {
		member = null;
		
		try {
			conn = getConnection(); //커넥션 메소드 호출
			query = "select * from member where id = ? and pw = ?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			rs = pstmt.executeQuery(); // select
			
			while(rs.next()) {
				id = rs.getString("id");
				pw = rs.getString("pw");
				member = new Member(id,pw);
			}
		} catch (Exception e) {	e.printStackTrace();
		}finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			} catch (Exception e2){e2.printStackTrace();}
		}
		
		return member;
	}//selectLogin
	
	
	
	
	//-------------------------------------
	//커넥션 풀에서 connection 객체 가져오기 메소드
	public Connection getConnection() {
		Connection connection = null;
		try {
			Context context = new InitialContext();
			DataSource ds = (DataSource)context.lookup("java:comp/env/jdbc/Oracle");
			connection = ds.getConnection();
			
		} catch (Exception e) { e.printStackTrace();}
		return connection;
	}//getConnection
	//-------------------------------------







	
	
	
	
	
}
