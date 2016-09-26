package com.mo.service;

import java.util.List;

import com.mo.entity.Emp;
import com.mo.entity.Pager;

public interface EmpService {
	
	public List<Emp> findEmps(Pager pager,Emp emp) throws Exception;

}
