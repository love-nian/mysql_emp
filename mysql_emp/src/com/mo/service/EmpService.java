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
	
	/**
	 * 根据ID查询员工信息
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Emp findById(Integer id) throws Exception;
	
	/**
	 * 修改员工信息
	 * @param emp
	 * @return
	 * @throws Exception
	 */
	public boolean updateEmp(Emp emp) throws Exception;
	
	/**
	 * 新增员工
	 * @param emp
	 * @return
	 * @throws Exception
	 */
	public boolean addEmp(Emp emp) throws Exception;
	
	/**
	 * 删除员工
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public boolean deleteEmp(Integer id) throws Exception;
	
	/**
	 * 根据员工编号和姓名查询用户，实现登录
	 * @param emp
	 * @return
	 * @throws Exception
	 */
	public boolean login(Emp emp) throws Exception;

}
