package com.sts.javaIoc.service.impl;

import com.sts.javaIoc.service.ParentService;

public class ParentServiceImpl implements ParentService {

	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	@Override
	public void message(String msg) {
		System.out.println("parent msg:"+msg);

	}
}
