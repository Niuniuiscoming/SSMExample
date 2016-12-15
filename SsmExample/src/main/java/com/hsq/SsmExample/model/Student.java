package com.hsq.SsmExample.model;

import java.io.Serializable;

public class Student implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1027024557234961280L;

	private Integer studentId;

    private String studentName;

    private String sex;
    
    public Student() {
		super();
	}

    public Student(int studentId, String studentName, String sex) {
    	this.studentId=studentId;
    	this.studentName=studentName;
    	this.sex=sex;
    }

    public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}


	public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}