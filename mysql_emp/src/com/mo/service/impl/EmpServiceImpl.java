package com.mo.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.mo.dao.EmpMapper;
import com.mo.entity.Emp;
import com.mo.entity.Pager;
import com.mo.service.EmpService;

public class EmpServiceImpl implements EmpService {
	@Autowired
	private EmpMapper empMapper;

	public void setEmpMapper(EmpMapper empMapper) {
		this.empMapper = empMapper;
	}

	@Override
	public List<Emp> findEmps(Pager pager,Emp emp) throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("offset", (pager.getCurrPage()-1)*pager.getPageSize());
		map.put("pagesize", pager.getPageSize());
		map.put("emp", emp);
		return empMapper.findEmps(map);
	}

}
