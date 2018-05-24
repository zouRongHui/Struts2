<%@page import="org.rone.study.struts2.myAction.Dao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	Dao myDao = new Dao();
	request.setAttribute("departments", myDao.getDepartments());
	request.setAttribute("roles", myDao.getRoles());
	//request.setAttribute("theme", "simple");
%>

<s:debug></s:debug>

<s:form action="testShowRegister.jsp" method="get">
	<s:textfield label="Name" name="userName"></s:textfield>
	<s:password label="Password" name="pass"></s:password>
	<s:radio label="Gender" list="#{'male':'Male','female':'Female' }" name="gender"></s:radio>
	<s:select label="Department" list="#request.departments" listKey="departmentID" listValue="departmentName" name="departmrnt"></s:select>
	<s:checkboxlist label="Role" list="#request.roles" listKey="roleID" listValue="roleName" name="role"></s:checkboxlist>
	<s:textarea label="Description" name="description"></s:textarea>
	<s:submit></s:submit>
</s:form>

</body>
</html>