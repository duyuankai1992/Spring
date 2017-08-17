package com.yztc.aop.demo4;
/**
 * 
 * JDK中提供AIP实现动态代理
 * CGLIB代理
 * 
 * AOP：核心即为动态代理    
 * Aspect Oriented Programming 面向切面编程
 * 
 * 
 * 目标对象：被代理的对象
 * 代理对象 
 * 切入点：（表达式，范围）指定哪些目标对象中的哪些方法执行的时候被拦截
 * 通知：确定共通业务执行的时机
 *    前置通知
 *    后置通知
 *    环绕通知
 *    异常通知
 *    最终通知
 *    
 *    try{
 *    	delete
 *    }chatch(){
 *    	执行共通功能 
 *    }finally{
 *    }
 *    
 *    EmpServiceImp 类中DELETE方法执行之前，调用权限验证
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
