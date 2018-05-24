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

<h4>this is first page</h4>
<br/><br/>

<s:debug></s:debug><br/><br/>

<form action="first.action" method="post">
	name<input type="text" name="memberName" /><br/><br/>
	pass<input type="text" name="memberPass" /><br/><br/>
	<input type="submit" value="submit">
</form>

<hr/>
<s:property value="#parameters.name"/>

<hr/>
<!-- 创建一个URL字符串 -->
<s:url value="MyTest" var="first">
	<!-- value会自动进行OGNL解析 -->
	<s:param name="name" value="#parameters.name"></s:param>
	<!-- 对于纯数字不会解析 -->
	<s:param name="pass" value="112"></s:param>
	<!-- 若不想解析，则使用单引号进行修饰 -->
	<s:param name="sex" value="'man'"></s:param>
</s:url>
${first }

<br/><br/>
<!-- 构建一个请求action的URL -->
<s:url action="MyAction" namespace="MyTest" method="excute" var="second"></s:url>
${second }

<br/><br/>
<!-- 获取当前页面的URL，并显示出来，includeParams用来指定是否显示参数(none,get,all) -->
<s:url includeParams="none"></s:url>

<hr/>
<!-- value会进行自动解析 -->
<s:set name="mone" value="#parameters.name" scope="session"></s:set>

${sessionScope.mone }--<s:property value="#session.mone"/>

<hr/>


</body>
</html>