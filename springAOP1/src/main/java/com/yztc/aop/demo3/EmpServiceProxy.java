package com.yztc.aop.demo3;

public class EmpServiceProxy implements EmpService{
	
	private EmpServiceImpl empServiceImpl = new EmpServiceImpl();
	private OtherService otherService = new OtherService();
	
	public void delete(){
		otherService.validate();
		empServiceImpl.delete();
	}

	public void update() {
		empServiceImpl.update();
	}

	public void save() {
		empServiceImpl.save();
	}

}
