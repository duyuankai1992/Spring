package com.yztc.demo.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yztc.demo.dao.impl.EmpDao;
import com.yztc.demo.entity.Emp;

@Service("empService")
public class EmpServiceImpl {
	
	@Resource
	private EmpDao empDao;
	public void setEmpDao(EmpDao empDao) {
		this.empDao = empDao;
	}
	
	public void save(Emp emp){
		empDao.save(emp);
	}
	
	public void deleteByEmpNos(Integer[] empNos){
		empDao.deleteByEmpNos(empNos);
	}
	
	
	public void deleteByEmpNo(Integer empNo1,Integer empNo2) throws Exception{
		empDao.deleteByEmpNo(empNo1);
		if(empNo2==1025){
			throw new Exception();
		}
		empDao.deleteByEmpNo(empNo2);
	}
}
