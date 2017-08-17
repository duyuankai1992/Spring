package com.yztc.demo.dao.impl;

import java.util.List;

import com.yztc.demo.entity.Emp;

public interface EmpDao {
	
	
	public void save(Emp emp);
	
	public void deleteByEmpNos(Integer[] empNos);
	
	public List<Emp> findAll();
	
	public void deleteByEmpNo(Integer empNo);

}
