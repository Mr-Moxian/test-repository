package com.sts.javaIoc.action;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sts.javaIoc.service.IocService;

public class IocAction {

	public static void main(String[] args) {
		//装载配置文件
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		IocService iocService =(IocService) ac.getBean("iocService");
		iocService.execute();
	}
}
