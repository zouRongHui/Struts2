<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<%@page import="org.rone.study.struts2.myBean.Member"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	List<Member> members = new ArrayList<Member>();
	members.add(new Member("AAA","aaa"));
	members.add(new Member("BBB","bbb"));
	members.add(new Member("CCC","ccc"));
	members.add(new Member("DDD","ddd"));
	members.add(new Member("EEE","eee"));
	
	request.setAttribute("members", members);
%>

<h1>this is form-tag-2</h1>

<hr/>
<s:debug></s:debug>

<br/><br/>
<s:form action="form_tag" method="post" >
	<s:textfield name="userName" label="userName"></s:textfield>
	<s:password name="pass" label="pass"></s:password>
	<s:textarea name="desc" label="Desc"></s:textarea>
	<s:checkbox name="used" label="Used"></s:checkbox>
	<s:radio name="language" list="#{'java':'JAVA','c&c++':'C&C++','swif':'SWIF' }" label="language"></s:radio>
	<s:checkboxlist name="members" list="#request.members" listKey="memberName" listValue="memberPass" label="Members"></s:checkboxlist>
	<s:select name="number" list="{11,22,33}" label="number" headerKey="" headerValue="please select">
		<s:optgroup label="others" list="#{'AA':44,'BB':55 }"></s:optgroup>
	</s:select>
	<s:submit></s:submit>
</s:form>
</body>
</html>