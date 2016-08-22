package com.neo.cglibproxy;

import java.lang.reflect.Method;

import com.neo.jdkproxy.PerformanceMonitor;

import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 *
 * @author lile
 * @date   2016年8月22日 time 下午6:31:02
 */
public class CglibProxy implements MethodInterceptor{
	private Enhancer enhancer = new Enhancer();
	public Object getProxy(Class clazz){
		enhancer.setSuperclass(clazz);
		enhancer.setCallback((Callback) this);
		return enhancer.create();
	}
	public Object intercept(Object obj, Method method, Object[]args,MethodProxy proxy) 
			throws Throwable{
		PerformanceMonitor.begin(obj.getClass().getName()+"."+method.getName());
		Object result = proxy.invokeSuper(obj, args);
		PerformanceMonitor.end();
		return result;
	}
}

