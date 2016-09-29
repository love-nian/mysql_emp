package com.mo.service.impl;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mo.entity.Dept;
import com.mo.entity.Emp;
import com.mo.entity.Pager;
import com.mo.service.EmpService;

public class EmpServiceImplTest {
	private ApplicationContext context;

	@Before
	public void setUp() throws Exception {
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
	}

	@After
	public void tearDown() throws Exception {
		context = null;
	}

	@Test
	public void testFindEmps() throws Exception {
		EmpService empService = (EmpService) context.getBean("empService");
		Pager pager = new Pager();
		Emp emp = new Emp();
		pager.setCurrPage(1);
		pager.setPageSize(5);
		emp.setJob("销售员");
		List<Emp> list = empService.findEmps(pager,emp);
		for (Emp emp2 : list) {
			System.out.println(emp2);
		}
	}
	
	@Test
	public void testFindById() throws Exception{
		EmpService empService = (EmpService) context.getBean("empService");
		Emp emp = empService.findById(1001);
		System.out.println(emp);
	}
	
	@Test
	public void testLogin() throws Exception{
		EmpService empService = (EmpService) context.getBean("empService");
		Emp emp = new Emp();
		emp.setEmpno(1001);
		emp.setEname("甘宁");
		boolean result = empService.login(emp);
		System.out.println(result);
	}
	
	@Test
	public void testAddEmp() throws Exception{
		EmpService empService = (EmpService) context.getBean("empService");
		Date hiredate = new SimpleDateFormat("yyyy-MM-dd").parse("2000-12-17");
		Dept dept = new Dept();
		/*dept.setDeptno(20);
		dept.setDname("学工部");
		dept.setLoc("上海");*/
		Emp emp = new Emp(1001, "甘宁", "文员", 1013 , 8000.0, null,hiredate,20);
		//emp.setDept(dept);
		boolean result = empService.addEmp(emp);
		System.out.println(result);
	}
	
	@Test
	public void testDelete() throws Exception{
		EmpService empService = (EmpService) context.getBean("empService");
		boolean result = empService.deleteEmp(1001);
		System.out.println(result);
	}
	
	@Test
	public void testUpdateEmp() throws Exception{
		EmpService empService = (EmpService) context.getBean("empService");
		Emp emp = new Emp();
		emp.setEname("甘宁");
		emp.setDepteno(20);
		emp.setEmpno(1001);
		boolean result = empService.updateEmp(emp);
		System.out.println(result);
	}
	

}
