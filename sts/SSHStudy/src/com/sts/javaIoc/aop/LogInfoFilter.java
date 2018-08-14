package com.sts.javaIoc.aop;

public class LogInfoFilter {

	public void logBefore() {
		System.out.println("-------before打日志-------");
	}
	
	public void logAfter() {
		System.out.println("-------after日志-------");
	}
}
