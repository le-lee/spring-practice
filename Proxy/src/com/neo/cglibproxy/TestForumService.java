package com.neo.cglibproxy;

import com.neo.noproxy.ForumServiceImpl;

/**
 *
 * @author lile
 * @date   2016年8月22日
 */
public class TestForumService {
	public static void main(String[] args) {
		CglibProxy proxy = new CglibProxy();
		ForumServiceImpl forumService = (ForumServiceImpl) proxy.getProxy(ForumServiceImpl.class);
		forumService.removeForum(10);
		forumService.removeTopic(1023);
	}
}

