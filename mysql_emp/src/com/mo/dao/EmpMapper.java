package com.mo.dao;

import java.util.List;
import java.util.Map;

import com.mo.entity.Emp;

public interface EmpMapper {

	public List<Emp> findEmps(Map<String, Object> map) throws Exception;
	
	
	
}
