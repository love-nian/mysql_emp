package com.mo.service.impl;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mo.entity.Dept;
import com.mo.entity.Emp;
import com.mo.service.DeptService;

public class DeptServiceImplTest {
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
	public void testFindDepts() {
		DeptService deptService = (DeptService) context.getBean("deptService");
		List<Dept> list = deptService.findDepts();
		for (Dept dept : list) {
			System.out.println(dept.getDname());
			System.out.println(dept.getLoc());
			for (Emp emp : dept.getEmps()) {
				System.out.println(emp);
			}
		}
	}

}
