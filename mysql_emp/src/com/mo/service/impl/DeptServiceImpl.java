package com.mo.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.mo.dao.DeptMapper;
import com.mo.entity.Dept;
import com.mo.service.DeptService;

public class DeptServiceImpl implements DeptService {
	@Autowired
	private DeptMapper deptMapper;

	public void setDeptMapper(DeptMapper deptMapper) {
		this.deptMapper = deptMapper;
	}

	@Override
	public List<Dept> findDepts() {
		Map<String, Object> map = new HashMap<String, Object>();
		return deptMapper.findDepts(map);
	}
	
	/**
	 * 默默新增的根据编号得到部门
	 * @param ID
	 * @return
	 */
	public Dept findDept(Integer ID){
		return null;
	}
	
	/**
	 * 巍巍新增的得到总记录数
	 * @return
	 */
	public Integer getcounts(){
		return null;
	}
	
	/**
	 * 巍巍新增的修改部门
	 */
	public boolean updateDept(Dept dept){
		return false;
	}
	
	/**
	 * 默默新增的删除部门,解决冲突
	 * @param dept
	 * @return
	 */
	public boolean delDept(Dept dept){
		return false;
	}
	
	/**
	 * 巍巍新增的show
	 */
	public void show(){
		System.out.println("巍巍新增的show");
	}

}
