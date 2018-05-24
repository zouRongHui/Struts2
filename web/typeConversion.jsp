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

	<s:form action="typeConversion">
		<s:textfield label="Age" name="age"></s:textfield>
		<s:textfield label="Model2.birth" name="model2.birth"></s:textfield>
		<s:textfield label="Model2.name" name="model2.name"></s:textfield>
		<s:submit></s:submit>
	</s:form>
	
	<s:form action="CollectionConversion">
		<s:textfield label="Age0" name="model[0].age"></s:textfield>
		<s:textfield label="Birth0" name="model[0].birth"></s:textfield>
		<s:textfield label="Age1" name="model[1].age"></s:textfield>
		<s:textfield label="Birth1" name="model[1].birth"></s:textfield>
		<s:textfield label="Age2" name="model[2].age"></s:textfield>
		<s:textfield label="Birth2" name="model[2].birth"></s:textfield>
		<s:submit></s:submit>
	</s:form>

</body>
</html>