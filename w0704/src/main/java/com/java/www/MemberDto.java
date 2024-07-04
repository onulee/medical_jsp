package com.java.www;

import java.sql.Timestamp;

public class MemberDto {

	private int memNo;
	private String id;
	private String pw;
	private String name;
	private String gender;
	private Timestamp mdate;
	private int no;
	
	public MemberDto(){}
	public MemberDto(int memNo, String id, String pw, String name, String gender, Timestamp mdate, int no) {
		this.memNo = memNo;
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.gender = gender;
		this.mdate = mdate;
		this.no = no;
	}
	
	public int getMemNo() {
		return memNo;
	}
	public void setMemNo(int memNo) {
		this.memNo = memNo;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Timestamp getMdate() {
		return mdate;
	}
	public void setMdate(Timestamp mdate) {
		this.mdate = mdate;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	
	
	
	
	
	
	
}
