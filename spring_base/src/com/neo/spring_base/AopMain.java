package com.neo.spring_base;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.neo.spring_base.service.IMonkeyService;

public class AopMain {

	public static void main(String[] args) throws InterruptedException {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		
//		IMonkeyService service = (IMonkeyService) ctx.getBean("monkeyService");
		IMonkeyService service = (IMonkeyService) ctx.getBean(IMonkeyService.class);
		service.touTaoZi();
//		service.kanTaoZi();
	}

}
