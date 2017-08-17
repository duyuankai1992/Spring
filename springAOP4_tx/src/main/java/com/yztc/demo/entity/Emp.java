package com.yztc.demo.entity;

import java.io.Serializable;
import java.sql.Date;
/**
 * 
 * TODO 员工实体类
 * 
 */
public class Emp implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	/*员工编号*/
	private Integer empNo;
	/*员工姓名*/
	private String ename;//员工姓名
	private double sal;
	private Date hiredate;
	private String phone;
	private String email;
	private String sex;
	
	public Emp(){}
	
	public Emp(String ename, double sal, Date hiredate, String phone, String email, String sex) {
		this.ename = ename;
		this.sal = sal;
		this.hiredate = hiredate;
		this.phone = phone;
		this.email = email;
		this.sex = sex;
		
		
		
	}
	public Emp(Integer empNo, String ename, double sal, Date hiredate, String phone, String email, String sex) {
		this.empNo = empNo;
		this.ename = ename;
		this.sal = sal;
		this.hiredate = hiredate;
		this.phone = phone;
		this.email = email;
		this.sex = sex;
	}
	public Integer getEmpNo() {
		return empNo;
	}
	public void setEmpNo(Integer empNo) {
		this.empNo = empNo;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((empNo == null) ? 0 : empNo.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		if (empNo == null) {
			if (other.empNo != null)
				return false;
		} else if (!empNo.equals(other.empNo))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Emp [empNo=" + empNo + ", ename=" + ename + ", sal=" + sal + ", hiredate=" + hiredate + ", phone="
				+ phone + ", email=" + email + ", sex=" + sex + "]";
	}

}
