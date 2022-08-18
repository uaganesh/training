package com.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Teacher {
@Id
	private int tid;
	private String tname;
	private int tage;
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public int getTage() {
		return tage;
	}
	public void setTage(int age) {
		this.tage = age;
	}
	@Override
	public String toString() {
		return "Teacher [tid=" + tid + ", tname=" + tname + ", tage=" + tage + "]";
	}
    
	
     
}
