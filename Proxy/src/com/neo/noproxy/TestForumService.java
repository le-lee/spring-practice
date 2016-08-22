package com.neo.noproxy;

import com.neo.service.ForumService;

/**
 *
 * @author lile
 * @date   2016年8月22日 
 */
public class TestForumService {
	public static void main(String[] args) {
		ForumService forumService = new ForumServiceImpl();
		forumService.removeForum(10);
		forumService.removeTopic(1012);
	}
}

