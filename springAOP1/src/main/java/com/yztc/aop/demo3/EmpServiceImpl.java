package com.yztc.aop.demo3;


/**
 * 
 * JDK���ṩAIPʵ�ֶ�̬����
 * CGLIB����
 * 
 * 
 * AOP�����ļ�Ϊ��̬����    
 * Aspect Oriented Programming ����������
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
