package com.mo.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.mo.dao.EmpMapper;
import com.mo.entity.Emp;
import com.mo.entity.Pager;
import com.mo.service.EmpService;

public class EmpServiceImpl implements EmpService {
	
	private static final Logger LOGGER = Logger.getLogger(EmpServiceImpl.class);
	@Autowired
	private EmpMapper empMapper;

	public void setEmpMapper(EmpMapper empMapper) {
		this.empMapper = empMapper;
	}

	@Override
	public List<Emp> findEmps(Pager pager,Emp emp) throws Exception {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("offset", (pager.getCurrPage()-1)*pager.getPageSize());
			map.put("pagesize", pager.getPageSize());
			map.put("emp", emp);
			return empMapper.findEmps(map);
			
		} catch (Exception e) {
			LOGGER.error(e);
			throw e;
		}
	}

	@Override
	public Integer getCount() throws Exception {
		return empMapper.getCount();
	}
	
	public Emp findById(Integer id) throws Exception{
		return empMapper.findByid(id);
	}

	@Override
	public boolean updateEmp(Emp emp) throws Exception {
		if (empMapper.updateEmp(emp)==1) {
			return true;
		}
		return false;
	}

	@Override
	public boolean addEmp(Emp emp) throws Exception {
		if (empMapper.insertEmp(emp)==1) {
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteEmp(Integer id) throws Exception {
		if (empMapper.deleteEmp(id)==1) {
			return true;
		}
		return false;
	}

	@Override
	public boolean login(Emp emp) throws Exception {
		if (empMapper.login(emp)!=null) {
			return true;
		}
		return false;
	}

}
