package com.neo.spring_base;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.neo.spring_base.service.IStudentService;

public class Main {

	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		
		IStudentService  studentService = ctx.getBean(IStudentService.class);
		IStudentService  studentService2 = ctx.getBean(IStudentService.class);
		System.out.println(studentService);
		System.out.println(studentService2);
		System.out.println(studentService.getStudentCount());
	}

}
