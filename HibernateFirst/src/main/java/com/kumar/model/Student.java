package com.kumar.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity //To create the table in the DB
@Table(name="StudentTable") // To explicitly create the  table name in the DB. If we don't write @table it will take
							// class name by default
public class Student 
{
	@Id //	To specify the primary key in the table in code level.
	@Column(name="SID")
	private Integer sid;
	
	@Column(name="SNAME")
	private String sname;
	
	@Column(name="SCITY")
	private String scity;
	
	
	public Student() 
	{
		System.out.println("Zero Param Constructor for Hibernate");
	}

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getScity() {
		return scity;
	}

	public void setScity(String scity) {
		this.scity = scity;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", scity=" + scity + "]";
	}
	
	
	
}
