package com.yztc.aop.demo4;
/**
 * 
 * JDK���ṩAIPʵ�ֶ�̬����
 * CGLIB����
 * 
 * AOP�����ļ�Ϊ��̬����    
 * Aspect Oriented Programming ����������
 * 
 * 
 * Ŀ����󣺱�����Ķ���
 * ������� 
 * ����㣺�����ʽ����Χ��ָ����ЩĿ������е���Щ����ִ�е�ʱ������
 * ֪ͨ��ȷ����ͨҵ��ִ�е�ʱ��
 *    ǰ��֪ͨ
 *    ����֪ͨ
 *    ����֪ͨ
 *    �쳣֪ͨ
 *    ����֪ͨ
 *    
 *    try{
 *    	delete
 *    }chatch(){
 *    	ִ�й�ͨ���� 
 *    }finally{
 *    }
 *    
 *    EmpServiceImp ����DELETE����ִ��֮ǰ������Ȩ����֤
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
