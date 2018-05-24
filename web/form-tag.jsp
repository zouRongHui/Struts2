<%@page import="org.rone.study.struts2.myBean.Member"%>
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

<%
	List<Member> members = new ArrayList<Member>();
	members.add(new Member("AAA","aaa"));
	members.add(new Member("BBB","bbb"));
	members.add(new Member("CCC","ccc"));
	members.add(new Member("DDD","ddd"));
	members.add(new Member("EEE","eee"));
	
	request.setAttribute("members", members);
%>	

<s:form action="form_tag" method="post" >
	<s:textfield name="userName" label="userName"></s:textfield>
	<s:password name="pass" label="pass"></s:password>
	<s:textarea name="desc" label="Desc"></s:textarea>
	<s:checkbox name="used" label="Used"></s:checkbox>
	<s:radio name="language" list="#{'java':'JAVA','c&c++':'C&C++','swif':'SWIF' }" 
		label="language"></s:radio>
	<!-- 若服务器端要收集复选框的提交值并回显，需要使用List类型来收集 -->
	<s:checkboxlist name="members" list="#request.members" 
		listKey="memberName" listValue="memberPass" label="Members">
		</s:checkboxlist>
	<!-- 下拉选框中list赋值如下的数组时，键和值相同，
		但s:optgroup中list必须要使用键值对(Map或者像如上的复选框) -->
	<s:select name="number" list="{11,22,33}" label="number" 
		headerKey="" headerValue="please select">
		<s:optgroup label="others" list="#{'AA':44,'BB':55 }"></s:optgroup>
	</s:select>
	<s:submit></s:submit>
</s:form>

</body>
</html>