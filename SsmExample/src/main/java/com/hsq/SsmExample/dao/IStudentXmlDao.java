package com.hsq.SsmExample.dao;

import org.springframework.stereotype.Repository;

import com.hsq.SsmExample.model.Student;

@Repository("studentXmlDao")
public interface IStudentXmlDao {

	int deleteByPrimaryKey(Integer id);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);

}
