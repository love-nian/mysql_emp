package com.mo.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.mo.dao.EmpMapper;
import com.mo.entity.Emp;
import com.mo.service.EmpService;

public class EmpServiceImpl implements EmpService {
	@Autowired
	private EmpMapper empMapper;

	public void setEmpMapper(EmpMapper empMapper) {
		this.empMapper = empMapper;
	}

	@Override
	public List<Emp> findEmps() throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		return empMapper.findEmps(map);
	}

}
