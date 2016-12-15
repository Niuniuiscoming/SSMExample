package com.hsq.SsmExample;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hsq.SsmExample.model.Student;
import com.hsq.SsmExample.service.IStudentService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis.xml")
public class MybatisTest {
	@Resource(name = "studentService")
	private IStudentService studentService;

	@Test
	public void testFind(){
		
		try {
			Student student = studentService.getStudentById(1);
			System.out.println(student);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testInsert(){
		
		try {
			Student student=new Student(0,"Ming","1");
			boolean flag= studentService.addStudent(student);
			System.out.println(flag);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
