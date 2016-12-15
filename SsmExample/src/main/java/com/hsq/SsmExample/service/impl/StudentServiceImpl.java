package com.hsq.SsmExample.service.impl;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import sun.misc.ProxyGenerator;

import com.hsq.SsmExample.dao.IStudentXmlDao;
import com.hsq.SsmExample.model.Student;
import com.hsq.SsmExample.service.IStudentService;

@Service("studentService")
public class StudentServiceImpl implements IStudentService {
	@Resource
	private IStudentXmlDao studentXmlDao;
	
	public Student getStudentById(int id) {
		//获取接口的动态代理类
		/*byte[] proxyClass=ProxyGenerator.generateProxyClass(studentXmlDao.getClass().getSimpleName(), studentXmlDao.getClass().getInterfaces());
		FileOutputStream fileOutputStream;
		try {
			fileOutputStream = new FileOutputStream("D:\\Proxy/$proxystudent.class");
			fileOutputStream.write(proxyClass);
			fileOutputStream.flush();
			fileOutputStream.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		return studentXmlDao.selectByPrimaryKey(id);
	}

	public boolean addStudent(Student student) {
		// TODO Auto-generated method stub
		return studentXmlDao.insert(student)>0;
	}

}
