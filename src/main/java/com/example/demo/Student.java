package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	private int sid;
	private String sname;
	private String email;
	
	public int getSid() {
		return sid;	
	}
	public String getSname() {
		return sname;
	}
	public String getEmail() {
		return email;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", email=" + email + "]";
	}
	
	
	
	
}
