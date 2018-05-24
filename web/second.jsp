<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<h4>this is second page</h4>
<br/><br/>
<s:debug></s:debug><br/><br/>
name:${memberName}<br/><br/>
pass:${memberPass}<br/><br/>
newname:<s:property value="memberName"/><br/><br/>
name2:<s:property value="#session.name"/><br/><br/>
pass2:<s:property value="#request.pass"/><br/><br/>
<s:property value="@java.lang.Math@PI"/><br/><br/>
<s:property value="@java.lang.Math@cos(0)"/><br/><br/>
<s:property value="[0].open('ok')"/><br/><br/>
<s:property value="#request.myArray.length"/>
<s:property value="#request.myArray[2]"/>


<hr/>



</body>
</html>