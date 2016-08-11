package com.neo.spring_base.service.impl;

import org.springframework.stereotype.Service;

import com.neo.spring_base.service.IMonkeyService;

@Service
public class MonkeyServiceImpl implements IMonkeyService {

	@Override
	public String touTaoZi() {
		System.out.println("猴子偷桃子了!");
		return "偷了一个";
	}

	@Override
	public void kanTaoZi() {
		System.out.println("猴子在看桃子!");
	}

}
