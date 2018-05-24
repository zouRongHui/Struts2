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
	request.setAttribute("myDao", myDao);
%>
<s:debug></s:debug>
	<s:textfield label="Name" name="userName"></s:textfield><br/>
	<s:password label="Password" name="pass"></s:password><br/>
	<s:radio label="Gender" list="#{'male':'Male','female':'Female' }" name="gender"></s:radio><br/>
	<s:select label="Department" list="#request.myDao.getDepartments()" listKey="departmentID" listValue="departmentName" name="departmrnt"></s:select><br/>
	<s:checkboxlist label="Role" list="#request.myDao.getRoles()" listKey="roleID" listValue="roleName" name="role"></s:checkboxlist><br/>
	<s:textfield label="Description" name="description"></s:textfield><br/>

</body>
</html>