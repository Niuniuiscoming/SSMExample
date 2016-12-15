package com.hsq.SsmExample.service;

import com.hsq.SsmExample.model.Student;

public interface IStudentService {

	Student getStudentById(int id);

	boolean addStudent(Student student);

}
