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
	
	//ʹ�÷������������
	@Pointcut("within(com.yztc.aop.demo4.*)")
	public void pointCutMethod(){}
	
	@Before("pointCutMethod()")
	public void validate(){
		System.out.println("Ȩ����֤");
	}
	
	@After("pointCutMethod()")
	public void doLog(){
		System.out.println("��־����");
	}
	/**
	 * TODO ���Ի���֪ͨ
	 * @param ProceedingJoinPoint pjp  ��װĿ�����
	 * 
	 */
	@Around("pointCutMethod()")
	public void doAround(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("����֪ͨǰ��5");	
		//��ȡĿ����� ��������޶���
		System.out.println(pjp.getTarget().getClass().getName());
		//����Ŀ������еķ���
		pjp.proceed();
		System.out.println("����֪ͨ���12");
	}
}
