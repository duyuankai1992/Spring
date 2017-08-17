package com.yztc.demo.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmpRowMapper implements RowMapper<Emp>{
	@Override
	public Emp mapRow(ResultSet rs, int arg1) throws SQLException {
		Emp emp = new Emp();
		emp.setEmpNo(rs.getInt("empno"));
		emp.setEname(rs.getString("ename"));
		return emp;
	}	
}
