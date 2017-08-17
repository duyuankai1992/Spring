package com.yztc.aop.demo2;

public class EmpServiceImpl {
	
	private OtherService otherService = new OtherService();
	
	public void delete(){
		
		otherService.validate();
		
		System.out.println("delete....");
		
		otherService.doLog();
		
	}
	
	public void update(){
		
		otherService.validate();
		
		System.out.println("update....");
		
		otherService.doLog();
		
	}
	
	public void save(){
		
		otherService.validate();
		
		System.out.println("save....");
		
		otherService.doLog();
		
	}
}
