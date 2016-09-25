package com.mo.dao;

import java.util.List;
import java.util.Map;

import com.mo.entity.Dept;

public interface DeptMapper {

	/**
	 * 查询所有的部门及其所包含的员工
	 * @param map
	 * @return
	 */
	public List<Dept> findDepts(Map<String, Object> map);
	
	public Dept findById(Integer deptno);
	
	public Integer addDept(Dept dept);
	
	public Integer deleteDept(Integer deptno);
	
	public Integer updateDept(Dept dept);
}
