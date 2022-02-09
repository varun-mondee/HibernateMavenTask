package com.mondee;

import javax.persistence.*;

@Table(name = "student")
@Entity
public class Student {
	@Id
	
	@Column(name = "sid")
	private int sid;
	
	@Column(name = "sname")
	private String sname;
	
	@Column(name = "smarks")
	private int smarks;
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSmarks() {
		return smarks;
	}
	public void setSmarks(int smarks) {
		this.smarks = smarks;
	}

}
