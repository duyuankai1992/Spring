package com.yztc.aop.demo3;


/**
 * 
 * JDK中提供AIP实现动态代理
 * CGLIB代理
 * 
 * 
 * AOP：核心即为动态代理    
 * Aspect Oriented Programming 面向切面编程
 * 
 * 
 * 
 * 
 * 
 * 
 */

public class EmpServiceImpl implements EmpService{
	
	public void delete(){
		System.out.println("delete....");
	}
	
	public void update(){
		System.out.println("update....");
	}
	
	public void save(){
		System.out.println("save....");
	}
}
