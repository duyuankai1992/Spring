package com.yztc.demo.dao.impl;

import java.sql.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yztc.demo.entity.Emp;
import com.yztc.demo.service.impl.EmpServiceImpl;

@SuppressWarnings("resource")
public class TestEmpDaoImpl {
	
	private EmpDaoImpl empDao;
	private EmpServiceImpl empService;
	
	@Before
	public void init(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		empDao = ctx.getBean("empDao",EmpDaoImpl.class);
		empService = ctx.getBean("empService",EmpServiceImpl.class);
	}
	
	@Test
	public void save(){
		try {
			Emp emp = new Emp();
			emp.setEname("ÊÂÎñ");
			emp.setHiredate(new Date(new java.util.Date().getTime()));//  "2012-3-23"-SimpleDateFormat->util.Date---->sql.Date
			empDao.save(emp);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void findAll(){
		try {
			List<Emp> listEmp = empDao.findAll();
			for(Emp emp:listEmp){
				System.out.println(emp.getEmpNo()+"\t"+emp.getEname());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void deleteByEmpNos() throws Exception{
		empService.deleteByEmpNo(1024,1025);
	}
}
