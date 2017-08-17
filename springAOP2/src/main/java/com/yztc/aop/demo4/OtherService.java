package com.yztc.aop.demo4;

import org.aspectj.lang.ProceedingJoinPoint;

public class OtherService {
	
	public void validate(){
		System.out.println("权限验证");
	}
	
	public void doLog(){
		System.out.println("日志备份");
	}
	/**
	 * TODO 测试环绕通知
	 * @param ProceedingJoinPoint pjp  封装目标对象
	 * 
	 */
	public void doAround(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("环绕通知前段5");	
		//获取目标对象 类的完整限定名
		System.out.println(pjp.getTarget().getClass().getName());
		//调用目标对象中的方法
		pjp.proceed();
		System.out.println("环绕通知后段12");
	}
}
