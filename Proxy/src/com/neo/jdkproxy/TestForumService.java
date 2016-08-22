package com.neo.jdkproxy;

import java.lang.reflect.Proxy;

import com.neo.service.ForumService;

/**
 *
 * @author lile
 * @date   2016年8月22日 
 */
public class TestForumService {
	public static void main(String[] args) {
		ForumService target = new ForumServiceImpl();
		PerformanceHandler handler = new PerformanceHandler(target);
		
		ForumService proxy = (ForumService) Proxy.newProxyInstance(target.getClass().getClassLoader(), 
				target.getClass().getInterfaces(), handler);
		proxy.removeForum(10);
		proxy.removeTopic(1012);
	}
}

