package com.yztc.aop.demo4;

public class EmpServiceImpl implements EmpService{
	
	//Ŀ��       target       �������
	//����       aspect       ��װ��ͨ�߼��Ĵ������
	//����       proxy        ͨ���������ģʽ��Ƶ���
	//���ӵ�   joinpoint    ����֯��ִ�еľ��������
	//֪ͨ       advisor      ����������Ŀ����ϵķ�ʽ       
	//�����   pointcut     ��Χ	
	//֯��       weave
	
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
