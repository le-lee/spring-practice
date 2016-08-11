package com.neo.spring_base.dao.impl;

import org.springframework.stereotype.Repository;

import com.neo.spring_base.dao.IStudentDao;

@Repository
public class StudentDaoImpl implements IStudentDao {

	@Override
	public Integer queryStudentCount() {
		return 10;
	}

}
