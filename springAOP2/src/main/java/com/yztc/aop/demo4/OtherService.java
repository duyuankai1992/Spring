package com.yztc.aop.demo4;

import org.aspectj.lang.ProceedingJoinPoint;

public class OtherService {
	
	public void validate(){
		System.out.println("Ȩ����֤");
	}
	
	public void doLog(){
		System.out.println("��־����");
	}
	/**
	 * TODO ���Ի���֪ͨ
	 * @param ProceedingJoinPoint pjp  ��װĿ�����
	 * 
	 */
	public void doAround(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("����֪ͨǰ��5");	
		//��ȡĿ����� ��������޶���
		System.out.println(pjp.getTarget().getClass().getName());
		//����Ŀ������еķ���
		pjp.proceed();
		System.out.println("����֪ͨ���12");
	}
}
