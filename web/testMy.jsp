<%@page import="java.util.Date"%>
<%@page import="org.rone.study.struts2.myAction.testMyComparator"%>
<%@page import="org.rone.study.struts2.myAction.TestMy"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
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
<s:if test="pass > 30">
	x>30
</s:if>
<s:elseif test="pass > 20">
	20&lt;x&lt;30
</s:elseif>
<s:else>
	x&lt;20
</s:else>

<hr/>
<%
	List<TestMy> lists = new ArrayList<TestMy>();
	lists.add(new TestMy("12"));
	lists.add(new TestMy("32"));
	lists.add(new TestMy("74"));
	lists.add(new TestMy("34"));
	lists.add(new TestMy("90"));
	lists.add(new TestMy("22"));
	lists.add(new TestMy("55"));
	lists.add(new TestMy("33"));
	lists.add(new TestMy("99"));
	lists.add(new TestMy("44"));
	lists.add(new TestMy("10"));
	
	request.setAttribute("lists", lists);
	
	testMyComparator tmc = new testMyComparator();
	request.setAttribute("comparator", tmc);
	
	Date date = new Date();
	request.setAttribute("MyDate", date);
%>

<s:iterator value="#request.lists">
	${pass }<br/>
</s:iterator>

<hr/>
<s:sort comparator="#request.comparator" source="#request.lists" var="lists2"></s:sort>

<s:iterator value="#attr.lists2">
	${pass }<br/>
</s:iterator>

<hr/>
<s:date name="#request.MyDate" format="YY-MM-dd hh-mm-ss" var="date2"/>
${date2 }

<hr/>
<!-- 可以使用%{}对需要进行强制OGNL解析的属性进行修饰 -->
<s:a href="MyAction?name=%{pass}">pass</s:a>

<hr/>
<s:debug></s:debug>
</body>
</html>