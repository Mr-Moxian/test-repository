package com.sts.javaIoc.action;

import com.sts.javaIoc.service.IocService;

public class IocAction extends BaseAction{

	private static final long serialVersionUID = 6664897079917317824L;

	private IocService iocService;
	/*public static void main(String[] args) {
		//装载配置文件
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		IocService iocService =(IocService) ac.getBean("iocService");
		iocService.execute();
	}*/
	
	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
	 */
	@Override
	public String execute() throws Exception {
		
		iocService.execute();
		return SUCCESS;
	}
	/**
	 * @param iocService the iocService to set
	 */
	public void setIocService(IocService iocService) {
		this.iocService = iocService;
	}
}
