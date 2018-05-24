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

<hr/>
<a href="testI18n?request_locale=en_US">英文</a>
<a href="testI18n?request_locale=zh_CN">中文</a>
<hr/>
<a href="index.jsp">index.jsp</a>
<hr/>

<s:text name="time">
	<s:param value="date"></s:param>
</s:text>
<s:form>
	<s:textfield name="userName" label="userName"></s:textfield>
	<s:textfield name="userName" key="userName"></s:textfield>
	<s:textfield name="passWord" key="passWord"></s:textfield>
	<s:submit key="submit"></s:submit>
	<s:submit value="%{getText('submit')}"></s:submit>
</s:form>
<hr/>
	<!-- 因为在对象栈中有一个DefaultTextProvider	的实例，其提供了访问国际化资源文件的的getText()方法
		   所以在label中可使用如下的方式来获取value值 -->
	<s:textfield name="userName" label="%{getText('userName')}"></s:textfield><br/>
	<s:text name="passWord"></s:text>

</body>
</html>