package com.java.www;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MemberDao {

	 Connection conn;
	 PreparedStatement pstmt;
	 ResultSet rs;
	 ArrayList<MemberDto> list = new ArrayList<MemberDto>();
	 int memNo;
	 String id,pw,name,gender;
	 Timestamp mdate;
	 int no;
	 
	 public ArrayList<MemberDto> doMember() {
		try {
			//커넥션 풀 사용
		  Context context = new InitialContext();
		  DataSource ds = (DataSource) context.lookup("java:comp/env/jdbc/Oracle");
		  conn = ds.getConnection();
		  //
		  String query = "select * from member";
		  pstmt = conn.prepareStatement(query);
		  rs = pstmt.executeQuery();
		  while(rs.next()){
			  memNo = rs.getInt("memNo");
			  id = rs.getString("id");
			  pw = rs.getString("pw");
			  name = rs.getString("name");
			  gender = rs.getString("gender");
			  mdate = rs.getTimestamp("mdate");
			  no = rs.getInt("no");
			  list.add(new MemberDto(memNo,id,pw,name,gender,mdate,no));
		  }	  
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return list;
	 }//member()
	 
	 
	
}
