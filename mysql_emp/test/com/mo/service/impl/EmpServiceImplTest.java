package com.mo.service.impl;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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

}
