package org.rone.study.struts2.myBean;

import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

public class Member implements RequestAware,SessionAware{
	private String memberName;
	private String memberPass;
	
	private Map<String, Object> requestMap;
	private Map<String, Object> sessionMap;
	
	public Member(String memberName, String memberPass) {
		super();
		this.memberName = memberName;
		this.memberPass = memberPass;
	}
	
	public Member() {
		// TODO Auto-generated constructor stub
	}
	
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getMemberPass() {
		return memberPass;
	}
	public void setMemberPass(String memberPass) {
		this.memberPass = memberPass;
	}
	
	public String save() {
		sessionMap.put("name", "rone");
		requestMap.put("pass", "123");
		
//		int i = 10 / 0;
		
		return "saveSuccess";
	}
	
	public String open(String str) {
		return "opening..." + str;
	}
	
	@Override
	public void setSession(Map<String, Object> session) {
		// TODO Auto-generated method stub
		this.sessionMap = session;
	}
	@Override
	public void setRequest(Map<String, Object> request) {
		// TODO Auto-generated method stub
		this.requestMap = request;
	}
	
}
