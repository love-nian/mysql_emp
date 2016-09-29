package com.mo.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mo.entity.Dept;
import com.mo.entity.Emp;
import com.mo.entity.Pager;
import com.mo.service.DeptService;
import com.mo.service.EmpService;

/**
 * 员工控制器
 * 当不继承相关类或是实现相关接口的时候，
 * 就只能通过注解的方式来编写，达到 注入业务逻辑层的目的
 * 如果要把多个员工的业务方法写到一个控制器中统一管理，就只能通过这种方式
 * @author Lenovo
 *
 */
@Controller
@RequestMapping("/")
public class EmpController {
	private static final Logger LOGGER = Logger.getLogger(EmpController.class);
	@Autowired
	private EmpService empService;
	public void setEmpService(EmpService empService) {
		this.empService = empService;
	}
	@Autowired
	private DeptService deptService;
	public void setDeptService(DeptService deptService) {
		this.deptService = deptService;
	}

	@RequestMapping(value="login.do",method={RequestMethod.POST})
	public String login(Emp emp,Model model){
		try {
			boolean result = empService.login(emp);
			if (result) {
				//model.addAttribute(result, "")
				//登录成功后转至一个公共的跳转页面
				return "success";
			}
			return "login";
			//return new ModelAndView("login");
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
			return "login";
			//return new ModelAndView("login");
		}
	}

	/**
	 * 查询所有员工信息
	 * @param pager 分页实体类
	 * @param emp 条件对象（负责接收条件）
	 * @param model 模型对象（负责把数据传递到页面）
	 * @return
	 */
	@RequestMapping(value="findEmps.do",method={RequestMethod.GET})
	public String findEmps(Pager pager,Emp emp,Model model){
		try {
			//调用业务层的方法得到员工总记录数并将其封装到pager对象中
			pager.setCounts(empService.getCount());
			//调用业务逻辑层的方法查询所有的员工
			List<Emp> emps = empService.findEmps(pager, emp);
			//把查询得到的员工信息封装到model对象中，传递到页面
			model.addAttribute("emp", emps);
			model.addAttribute("pager", pager);
			return "emp_list";
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
			return null;
		}
	}
	
	/**
	 * 修改前的查询详情
	 * @param empno
	 * @param model
	 * @return
	 */
	@RequestMapping(value="findById.do",method={RequestMethod.GET})
	public String findById(Integer empno,Model model){
		try {
			//调用业务层的根据ID得到员工信息
			Emp emp = empService.findById(empno);
			LOGGER.info(emp);
			//查出所有的部门
			List<Dept> depts = deptService.findDepts();
			/*Map<Integer, Object> deptNames = new HashMap<Integer, Object>();
			//把部门编号和对应的部门名封装到Map中
			for (Dept dept : depts) {
				deptNames.put(dept.getDeptno(), dept.getDname());
			}
			emp.setDeptNames(deptNames);*/
			model.addAttribute("depts", depts);
			model.addAttribute("data", emp);
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
		}
		return "emp_update";
	}
	
	/**
	 * 修改员工
	 * @param emp
	 * @param model
	 * @return
	 */
	@RequestMapping(value="updateEmp.do",method={RequestMethod.POST})
	public String updateEmp(Emp emp,Model model){
		try {
			boolean result = empService.updateEmp(emp);
			//修改后跳转至查询所有
			if (result) {
				//model.addAttribute(result, "")
				//登录成功后转至一个公共的跳转页面
				return "success";
			}
			return "emp_update";
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
			return "emp_update";
		}
	}
	
	/**
	 * 新增员工
	 * @param emp
	 * @param model
	 * @return
	 */
	@RequestMapping(value="addEmp.do",method={RequestMethod.POST})
	public String addEmp(Emp emp,Model model){
		try {
			boolean result = empService.addEmp(emp);
			if (result) {
				return "success";
			}return "emp_add";
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
			return "emp_add";
		}
	}
	
	/**
	 * 删除员工
	 * @param emp
	 * @param model
	 * @return
	 */
	@RequestMapping("delete.do")
	public String deleteEmp(Emp emp,Model model){
		try {
			empService.deleteEmp(emp.getEmpno());
				return "success";
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
			return "success";
		}
	}

}
