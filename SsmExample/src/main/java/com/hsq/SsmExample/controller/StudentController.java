package com.hsq.SsmExample.controller;


import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import com.hsq.SsmExample.model.Student;
import com.hsq.SsmExample.service.IStudentService;

@Controller
@RequestMapping("/student")
public class StudentController {
	//@Resource(name="studentService")
	@Autowired
	private IStudentService studentService;
	
	@RequestMapping("/getStudentById")
	public @ResponseBody Student getStudentById(@RequestParam int id) throws SecurityException, NoSuchFieldException{
		Student student=studentService.getStudentById(id);
		return student;
	}
}
