package com.neo.spring_base.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ServicePointCut {
	
	@Pointcut("execution(* *(..))")
	public void pointCut(){}

	@Before("pointCut()")
	public void doBefore(JoinPoint join ){
		System.out.println("发现猴子要偷桃子了!");
	}
	
	@Around("pointCut()")
	public void around(ProceedingJoinPoint join ) throws Throwable{
		System.out.println("调用方法之前");
		join.proceed();
		System.out.println("调用方法之后");
	}
	
	@After("pointCut()")
	public void doEnd(JoinPoint join){
		System.out.println("抓住猴子了!");
	}
	
}
