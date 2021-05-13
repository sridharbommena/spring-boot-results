package com.sridhar.results.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="r15results")
public class Result {
	
	String htno;
	String subject_code;
	String subject_name;
	String grade;
	int grade_point;
	
	@Id
	int tid;
	
	public String getHtno() {
		return htno;
	}
	public void setHtno(String htno) {
		this.htno = htno;
	}
	public String getSubject_code() {
		return subject_code;
	}
	public void setSubject_code(String subject_code) {
		this.subject_code = subject_code;
	}
	public String getSubject_name() {
		return subject_name;
	}
	public void setSubject_name(String subject_name) {
		this.subject_name = subject_name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public int getGrade_point() {
		return grade_point;
	}
	public void setGrade_point(int grade_point) {
		this.grade_point = grade_point;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}

	@Override
	public String toString() {
		return "Result [htno=" + htno + ", subject_code=" + subject_code + ", subject_name=" + subject_name + ", grade="
				+ grade + ", grade_point=" + grade_point + ", tid=" + tid + "]";
	}
	

}

/*
+--------------+--------------+------+-----+---------+-------+
| htno         | varchar(20)  | NO   |     | NULL    |       |
| subject_code | varchar(20)  | NO   |     | NULL    |       |
| subject_name | varchar(200) | NO   |     | NULL    |       |
| grade        | varchar(10)  | NO   |     | NULL    |       |
| grade_point  | int          | NO   |     | NULL    |       |
| tid          | int          | NO   | PRI | NULL    |       |
+--------------+--------------+------+-----+---------+-------+
 */