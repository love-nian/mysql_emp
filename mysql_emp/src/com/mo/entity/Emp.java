package com.mo.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Emp {

	private Integer empno;
	private String ename ;
	private String job;
	private Integer mgr ;
	private Double sal ;
	private Double comm ;
	//@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date hiredate;
	private Dept dept;
	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", ename=" + ename + ", job=" + job
				+ ", mgr=" + mgr + ", sal=" + sal + ", comm=" + comm
				+ ", dept=" + dept + "]";
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(Integer empno, String ename, String job, Integer mgr, Date hiredate,
			Double sal, Double comm, Dept dept) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.mgr = mgr;
		this.hiredate = hiredate;
		this.sal = sal;
		this.comm = comm;
		this.dept = dept;
	}
	public Integer getEmpno() {
		return empno;
	}
	public void setEmpno(Integer empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public Integer getMgr() {
		return mgr;
	}
	public void setMgr(Integer mgr) {
		this.mgr = mgr;
	}
	public Double getSal() {
		return sal;
	}
	public void setSal(Double sal) {
		this.sal = sal;
	}
	public Double getComm() {
		return comm;
	}
	public void setComm(Double comm) {
		this.comm = comm;
	}
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
	}
}
