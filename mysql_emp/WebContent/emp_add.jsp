<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="js/My97DatePicker/WdatePicker.js"></script>
<script type="text/javascript" src="js/jquery-1.8.3.js"></script>

<title>Insert title here</title>

 <script type="text/javascript">
	$(function(){
		$.ajax({
			url:"findDepts.do",
			type:"get" /* ,
			success:function(data){
				
			}  */
		});
	});  
</script>
</head>
<body>
<div style="margin-left: 400px">
	<form action="addEmp.do" method="post">
		员工姓名：<input type="text" name="ename"/><br>
		员工部门： 
			<select name="deptno">
				<option value="0">请选择</option>
				<c:forEach items="${dept }" var="dept">
				<option value="${dept.deptno }">${dept.dname }</option>
				</c:forEach>
			</select><br>
		
		员工工资：<input type="text" name="sal"/><br>
		员工奖金：<input type="text" name="comm"><br>
		员工岗位：<input type="text" name="job"/><br>
		入职日期：<input type="text" name="hiredate"class="Wdate" onfocus="WdatePicker({lang:'zh-cn'}) "/><br>
		<input type="submit" value="新增员工"/>
	</form>
</div>
</body>
</html>