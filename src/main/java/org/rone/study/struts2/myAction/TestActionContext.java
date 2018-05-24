package org.rone.study.struts2.myAction;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;

import com.opensymphony.xwork2.ActionContext;

public class TestActionContext {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public String execute() {
		
		//0.获取ActionContext对象,ActionContext是action的上下文对象
		ActionContext actionContext = ActionContext.getContext();
		
		//1.获取application对应的map
		Map<String, Object> applicationMap = actionContext.getApplication();
		applicationMap.put("applicationKey", "applicationValue");
		String s = (String) applicationMap.get("keyName");
		System.out.println(s);
		
		//2.获取session对应的map
		Map<String, Object> sessionMap = actionContext.getSession();
		sessionMap.put("sessionKey", "sessionValue");
		//使session失效
		if(sessionMap instanceof SessionMap) {
			SessionMap sm = (SessionMap) sessionMap;
			sm.invalidate();
		}
		
		//3.获取request对应的map，需要手动的用get("request")来获取
		Map<String, Object> requestMap = (Map<String, Object>) actionContext.get("request");
		requestMap.put("requestKey", "requestValue");
		
		//4.获取参数，获取的object为string数组，且该map只有读有效
//		Map<String, Object> parameterMap = actionContext.getParameters();
//		String str = ((String[]) parameterMap.get("name"))[0];
//		System.out.println(str);
		
		return "success";
	}
	
}
