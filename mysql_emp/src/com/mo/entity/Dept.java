package com.mo.entity;

import java.util.List;
import java.util.Set;

public class Dept {

	private Integer deptno;
	private String dname ;
	private String loc ;
	private List<Emp> emps ;
	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getDeptno() {
		return deptno;
	}
	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	@Override
	public String toString() {
		return "Dept [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc
				+ ", emps=" + emps + "]";
	}
	public Dept(Integer deptno, String dname, String loc, List<Emp> emps) {
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
		this.emps = emps;
	}
	public List<Emp> getEmps() {
		return emps;
	}
	public void setEmps(List<Emp> emps) {
		this.emps = emps;
	}
}
