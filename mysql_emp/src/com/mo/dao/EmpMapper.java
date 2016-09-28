package com.mo.dao;

import java.util.List;
import java.util.Map;

import com.mo.entity.Emp;

public interface EmpMapper {
	
	/**
	 * 得到总记录数
	 * @return
	 * @throws Exception
	 */
	public Integer getCount() throws Exception;

	/**
	 * 分页动态查询所有
	 * @param map
	 * @return
	 * @throws Exception
	 */
	public List<Emp> findEmps(Map<String, Object> map)throws Exception;
	
	/**
	 * 根据ID查询员工
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Emp findByid(Integer id)throws Exception;

	/**
	 * 修改员工信息
	 * @param emp
	 * @return
	 * @throws Exception
	 */
	public Integer updateEmp(Emp emp)throws Exception;
	
	/**
	 * 删除员工 
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Integer deleteEmp(Integer id)throws Exception;
	
	/**
	 * 新增员工
	 * @param emp
	 * @return
	 * @throws Exception
	 */
	public Integer insertEmp(Emp emp)throws Exception;
	
	
	
	
}
