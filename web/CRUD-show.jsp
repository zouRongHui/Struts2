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

<s:debug></s:debug>

<s:form action="CRUD-add">
	<s:textfield name="employeeFirstName" label="FirstName"></s:textfield>
	<s:textfield name="employeeLastName" label="LastName"></s:textfield>
	<s:submit></s:submit>
</s:form>

<br/><hr/><br/>

<table cellpadding="10" cellspacing="0" border="1" >
	<thead>
		<tr>
		<td>ID</td>
		<td>firstName</td>
		<td>lastName</td>
		<td>edit</td>
		<td>delete</td>
		</tr>
	</thead>
	<tbody>
		<s:iterator value="#request.employees">
			<tr>
			<td>${employeeID }</td>
			<td>${employeeFirstName }</td>
			<td>${employeeLastName }</td>
			<td><a href="CRUD-edit?employeeID=${employeeID }">edit</a></td>
			<td><a href="CRUD-delete?employeeID=${employeeID }">delete</a></td>
			</tr>
		</s:iterator>
	</tbody>
</table>

</body>
</html>