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
	
	//springJDBC ��̎�팍�F
	
	/*
	 * ���Ĺ��ܣ�����ɾ������
	 * 
	 * 
	 * ��ע����  ��������
	 * 
	 * ��ͨ����
	 * 
	 * Ȩ����֤
	 * ������
	 * ��־����
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
					throw new RuntimeException("�����ˣ�");
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
