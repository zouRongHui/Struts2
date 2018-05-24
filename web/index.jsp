<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<a href="myStruts20?name=rone">click</a>

<br/><br/>
<%
	application.setAttribute("keyName", "rone is greet");
%>
<a href="testActionContext.action?name=rone">Action Context</a>

<br/><br/>
<a href="testAware.do?name=snow">Aware</a>

<br/><br/>
<a href="goLogin.do">Login</a>

<br/><br/>
<a href="testResult.do">testResult</a>

<br/><br/>
<a href="wildcard.jsp">Test Wildcard</a>

<hr/>
<form action="testMy">
	<input type="text" name="pass" />
	<input type="submit" value="submit"/>
</form>

<hr/>
<a href="form-tag.jsp">form-tag.jsp Test</a>

<hr/>
<a href="CRUD-show.action">CRUD-Show</a>

</body>

<hr/>
<a href="typeConversion.jsp">typeConversion.jsp</a>

<hr/>
<a href="testI18n">testI18n</a>

<hr/>
<a href="TestValidator/testValidator.jsp">TestValidator</a>


</html>