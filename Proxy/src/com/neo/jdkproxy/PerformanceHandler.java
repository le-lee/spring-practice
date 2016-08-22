package com.neo.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import com.neo.noproxy.PerformanceMonitor;

/**
 *
 * @author lile
 * @date   2016年8月22日 
 */
public class PerformanceHandler implements InvocationHandler{
	
	private Object target;
	public PerformanceHandler(Object target){
		this.target = target;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		PerformanceMonitor.begin(target.getClass().getName()+"."+method.getName());
		Object obj = method.invoke(target, args);
		PerformanceMonitor.end();
		return obj;
	}

}

