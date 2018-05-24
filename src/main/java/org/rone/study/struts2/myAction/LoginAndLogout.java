package org.rone.study.struts2.myAction;

import java.util.Map;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.SessionAware;

public class LoginAndLogout implements SessionAware,ApplicationAware{

	private String userName;
	private String pass;
	private Map<String, Object> applicationMap;
	
	public String login() {

		//人数+1
		Integer count = (Integer) applicationMap.get("count");
		if(count == null) {
			count = 0;
		}
		count++;
		applicationMap.put("count", count);
		
		return "login-success";
	}
	
	public String logout() {
		
		Integer count = (Integer) applicationMap.get("count");
		if (count != null && count > 0) {
			count--;
			applicationMap.put("count", count);
		}
		
		return "logout-success";
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	@Override
	public void setApplication(Map<String, Object> application) {
		this.applicationMap = application;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		
	}
}
