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

}
