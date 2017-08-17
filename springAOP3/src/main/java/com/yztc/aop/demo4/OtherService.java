package com.yztc.aop.demo4;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class OtherService {
	
	//使用方法定义切入点
	@Pointcut("within(com.yztc.aop.demo4.*)")
	public void pointCutMethod(){}
	
	@Before("pointCutMethod()")
	public void validate(){
		System.out.println("权限验证");
	}
	
	@After("pointCutMethod()")
	public void doLog(){
		System.out.println("日志备份");
	}
	/**
	 * TODO 测试环绕通知
	 * @param ProceedingJoinPoint pjp  封装目标对象
	 * 
	 */
	@Around("pointCutMethod()")
	public void doAround(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("环绕通知前段5");	
		//获取目标对象 类的完整限定名
		System.out.println(pjp.getTarget().getClass().getName());
		//调用目标对象中的方法
		pjp.proceed();
		System.out.println("环绕通知后段12");
	}
}
