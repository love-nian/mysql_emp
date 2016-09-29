<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-1.8.3.js"></script>
<script type="text/javascript">
	/* 
	function changPage(data){
		if (data=="first") {
			location  ;
		}
	} */
	
	function checkDel(){
		return confirm("确定要删除吗");
	}
	
</script>
</head>
<body>
<div style="margin-right: 0"><a href="findDepts.do">新增员工</a></div>
	<center>
	<%--<form:form action="findEmps.do" method="get" >
	 	部门：<form:select path="" items="" ></form:select> --%>
		<table border="1" align="center" cellpadding="0" cellspacing="0" width="80%">
			<tr align="center">
				<td>员工编号</td>
				<td>员工姓名</td>
				<td>员工部门</td>
				<td>员工工资</td>
				<td>员工奖金</td>
				<td>员工岗位</td>
				<td>入职日期</td>
				<td>部门经理</td>
				<td>操作</td>
			</tr>
			<c:forEach items="${emp }" var="emp">
				<tr align="center">
					<td>${emp.empno }</td>
					<td>${emp.ename }</td>
					<td>${emp.dept.dname }</td>
					<td>${emp.sal }</td>
					<td>${emp.comm }</td>
					<td>${emp.job }</td>
					<td><%-- ${emp.hiredate} --%> <fmt:formatDate value="${emp.hiredate }" type="date" pattern="yyyy-MM-dd"/></td>
					<td>${emp.mgr }</td>
					<td>
						<a href="findById.do?empno=${emp.empno }">修改</a>
						<a href="delete.do?empno=${emp.empno }" onclick="return checkDel()">删除</a>
					</td>
				</tr>
			</c:forEach>
		</table>
		当前第${pager.currPage }页/共${pager.totalPage }页
		<c:choose>
			<c:when test="${pager.currPage-1<=0 }">首页 下一页</c:when>
			<c:otherwise>
				<a href="findEmps.do?currPage=1">首页</a>
				<a href="findEmps.do?currPage=${pager.currPage-1 }">上一页</a>
			</c:otherwise>
		</c:choose>
		<c:choose>
			<c:when test="${pager.currPage+1>pager.totalPage }">下一页 尾页</c:when>
			<c:otherwise>
			<a href="findEmps.do?currPage=${pager.currPage+1 }">下一页</a>
			<a href="findEmps.do?currPage=${pager.totalPage }">尾页</a>
		</c:otherwise>
		</c:choose>
		
		<%-- <c:choose>
			<c:when test="${pager.currPage-1<=0 }">首页 下一页</c:when>
			<c:otherwise>
				<a href="javascript:changPage(first)">首页</a>
				<a href="javascript:changPage(second)">上一页</a>
			</c:otherwise>
		</c:choose>
		<c:choose>
			<c:when test="${pager.currPage+1>=pager.totalPage }">下一页 尾页</c:when>
			<c:otherwise>
			<a href="javascript:changPage(third)">下一页</a>
			<a href="javascript:changPage(fourth)">尾页</a>
		</c:otherwise>
		</c:choose> --%>
		
<%-- </form:form> --%>

	</center>
</body>
</html>