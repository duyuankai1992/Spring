package com.yztc.aop.demo4;

import org.springframework.stereotype.Service;

@Service("empService")
public class EmpServiceImpl implements EmpService{
	
	//目标       target       核心组件
	//切面       aspect       封装共通逻辑的代码的类
	//代理       proxy        通过代理设计模式设计的类
	//连接点   joinpoint    代码织入执行的具体代码行
	//通知       advisor      设置切面与目标耦合的方式       
	//切入点   pointcut     范围	
	//织入       weave
	
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
