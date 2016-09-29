package com.mo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mo.entity.Dept;
import com.mo.service.DeptService;

@Controller
@RequestMapping("/")
public class DeptController {
	
	@Autowired
	private DeptService deptService;

	public void setDeptService(DeptService deptService) {
		this.deptService = deptService;
	}

	@RequestMapping(value="findDepts.do",method={RequestMethod.GET})
	public String findDepts(Model model){
		List<Dept> depts = deptService.findDepts();
		model.addAttribute("dept", depts);
		return "emp_add";
	}
}
