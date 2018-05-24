package org.rone.study.struts2.myAction;

import java.util.Map;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.ParameterAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

public class TestAware implements ApplicationAware,SessionAware,RequestAware,ParameterAware{
	private Map<String, String[]> parameterMap;
	private Map<String, Object> requestMap;
	private Map<String, Object> applicationMap;
	private Map<String, Object> sessionMap;
	public String execute() {
		applicationMap.put("applicationKey", "applicationValue");
		sessionMap.put("sessionKey", "sessionValue");
		requestMap.put("requestKey", "requestValue");
		String str = ((String[]) parameterMap.get("name"))[0];
		System.out.println(str);
		return "success";
	}
	@Override
	public void setParameters(Map<String, String[]> arg0) {
		this.parameterMap = arg0;
	}
	@Override
	public void setRequest(Map<String, Object> arg0) {
		this.requestMap = arg0;
	}
	@Override
	public void setSession(Map<String, Object> arg0) {
		this.sessionMap = arg0;
	}
	@Override
	public void setApplication(Map<String, Object> arg0) {
		this.applicationMap = arg0;
	}
}
