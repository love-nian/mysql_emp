package com.mo.dao;

import java.util.List;
import java.util.Map;

import com.mo.entity.Dept;

public interface DeptMapper {

	public List<Dept> finDepts(Map<String, Object> map);
	
	public Dept findById(Integer deptno);
	
	public Integer addDept(Dept dept);
	
	public Integer deleteDept(Integer deptno);
	
	public Integer updateDept(Dept dept);
}
