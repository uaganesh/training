package com.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ClassDemo {
@Id
	private int cid;
	private String csection;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCsection() {
		return csection;
	}
	public void setCsection(String csection) {
		this.csection = csection;
	}
	@Override
	public String toString() {
		return "Class [cid=" + cid + ", csection=" + csection + "]";
	}
	
	
	
}
