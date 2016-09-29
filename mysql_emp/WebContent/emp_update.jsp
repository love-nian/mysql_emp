<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="js/My97DatePicker/WdatePicker.js"></script>
<title>Insert title here</title>
</head>
<body>
	<div style="margin-left: 300px">
		<form:form action="updateEmp.do" method="post" modelAttribute="data">
			<form:hidden  path="empno"/><br> 
			员工姓名：<form:input path="ename"/><br>
			员工部门：<form:select path="deptno" items="${depts }" itemValue="deptno" itemLabel="dname" /><br>
			员工工资：<form:input path="sal"/><br>
			员工奖金：<form:input path="comm"/><br>
			员工岗位：<form:input path="job"/><br>
			入职日期：<form:input path="hiredate" class="Wdate" onfocus="WdatePicker({lang:'zh-cn'}) "/><br> 
		<%-- 	入职日期：<input type="text" name="date" value="${data.hiredate }" class="Wdate" onfocus="WdatePicker({lang:'zh-cn'})"/> --%>
			<input type="submit" value="修改"/>
		</form:form>
	</div>
</body>
</html>