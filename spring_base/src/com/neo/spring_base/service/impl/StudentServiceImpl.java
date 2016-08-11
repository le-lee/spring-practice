package com.neo.spring_base.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.neo.spring_base.dao.IStudentDao;
import com.neo.spring_base.dao.impl.StudentDaoImpl;
import com.neo.spring_base.service.IStudentService;

@Service("studentService")
public class StudentServiceImpl implements IStudentService {
	
	@Autowired
	private IStudentDao studentDao;
	
	@Override
	public Integer getStudentCount() {
		return studentDao.queryStudentCount();
	}
	

//	public IStudentDao getStudentDao() {
//		return studentDao;
//	}
//
//	public void setStudentDao(IStudentDao studentDao) {
//		this.studentDao = studentDao;
//	}
	
	

}
