package com.sts.javaIoc.service.impl;

import com.sts.javaIoc.dao.IocDao;
import com.sts.javaIoc.service.IocService;

public class IocServiceImpl implements IocService {

	private IocDao iocDao;
	
	public void setIocDao(IocDao iocDao) {
		this.iocDao = iocDao;
	}
	
	public IocServiceImpl() {
		System.out.println("IocServiceImpl create");
	}
	
	@Override
	public void execute() {
		iocDao.execute();
	}
	
}
