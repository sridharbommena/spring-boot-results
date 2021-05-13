package com.sridhar.student.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	
	int sno;
	String code;
	
	@Id
	String htno;
	
	String name;
	String father;
	
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getHtno() {
		return htno;
	}
	public void setHtno(String htno) {
		this.htno = htno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFather() {
		return father;
	}
	public void setFather(String father) {
		this.father = father;
	}
	
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", code=" + code + ", htno=" + htno + ", name=" + name + ", father=" + father
				+ "]";
	}
	

}
//
//+--------+-------------+------+-----+---------+-------+
//| sno    | int         | NO   |     | NULL    |       |
//| code   | char(5)     | NO   |     | NULL    |       |
//| htno   | varchar(10) | NO   | PRI | NULL    |       |
//| name   | char(70)    | NO   |     | NULL    |       |
//| father | char(70)    | NO   |     | NULL    |       |
//+--------+-------------+------+-----+---------+-------+



