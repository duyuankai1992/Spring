package com.yztc.demo.dao.impl;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.yztc.demo.entity.Emp;
import com.yztc.demo.entity.EmpRowMapper;

@Repository("empDao")
public class EmpDaoImpl implements EmpDao{
	
	@Resource
	private JdbcTemplate jdbcTemplate;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void save(Emp emp){
		jdbcTemplate.update("INSERT INTO emp(empno,ename,hiredate) VALUES(empseq.NEXTVAL,?,?)", 
				new Object[]{emp.getEname(),emp.getHiredate()});
	}
	
	public void delete(Integer empNo){
		jdbcTemplate.update("DELETE FROM emp WHERE empno=?",new Object[]{empNo});
	}
	
	public List<Emp> findAll(){
		return jdbcTemplate.query("SELECT * FROM emp", new EmpRowMapper());
	}
	
	//springJDBC 批處理實現
	
	/*
	 * 核心功能：批量删除数据
	 * 
	 * 
	 * 关注事务  事务处理功能
	 * 
	 * 共通功能
	 * 
	 * 权限验证
	 * 事务处理
	 * 日志处理
	 * 
	 * AOP
	 * 
	 */	
	public void deleteByEmpNos(Integer[] empNos){	
		jdbcTemplate.batchUpdate("DELETE FROM emp WHERE empno=?",
				new BatchPreparedStatementSetter() {
			@Override
			public void setValues(PreparedStatement pstmt, int i) throws SQLException {
				if(i==2){
					throw new RuntimeException("出错了！");
				}
				pstmt.setInt(1, empNos[i]);
			}
			@Override
			public int getBatchSize() {
				return empNos.length;
			}
		});		
	}	
	
	public void deleteByEmpNo(Integer empNo){	
		jdbcTemplate.update("DELETE FROM emp WHERE empno=?",new Object[]{empNo});
	}
}
