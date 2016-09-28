package com.mo.service;

import java.util.List;

import com.mo.entity.Emp;
import com.mo.entity.Pager;

public interface EmpService {
	
	/**
	 * 得到总记录数
	 * @return
	 * @throws Exception
	 */
	public Integer getCount() throws Exception;
	
	/**
	 * 分页查询所有的员工信息
	 * @param pager
	 * @param emp
	 * @return
	 * @throws Exception
	 */
	public List<Emp> findEmps(Pager pager,Emp emp) throws Exception;

}
