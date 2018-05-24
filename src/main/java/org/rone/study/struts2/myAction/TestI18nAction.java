package org.rone.study.struts2.myAction;

import java.util.Arrays;
import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

public class TestI18nAction extends ActionSupport {	
	private Date date = new Date();
	public String execute(){
		//在action中访问国际化资源文件
		System.out.println(getText("userName"));
		//带有占位符的
		String time = getText("time", Arrays.asList(date));
		System.out.println(time);
		return "success";
	}
	
	
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	private static final long serialVersionUID = 1L;

}
