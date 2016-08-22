package com.neo.noproxy;

import com.neo.service.ForumService;

/**
 *
 * @author lile
 * @date   2016年8月22日 
 */
public class ForumServiceImpl implements ForumService{
	public void removeTopic(int topicId){
		PerformanceMonitor.begin("com.neo.ForumServiceImpl.removeTopic");
		System.out.println("模拟删除Topic记录："+ topicId);
		try {
			Thread.currentThread();
			Thread.sleep(20);
			
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		PerformanceMonitor.end();
	}
	public  void removeForum(int forumId){
		PerformanceMonitor.begin("com.neo.ForumServiceImpl.removeForum");
		System.out.println("模拟删除了Forum记录："+forumId);
		try {
			Thread.currentThread();
			Thread.sleep(40);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		PerformanceMonitor.end();
	}
}

