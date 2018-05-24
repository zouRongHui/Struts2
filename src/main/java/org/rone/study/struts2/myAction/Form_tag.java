package org.rone.study.struts2.myAction;

import java.util.List;

public class Form_tag {
	private String userName;
	private String pass;
	private String desc;
	private boolean used;
	
	private String language;
	@SuppressWarnings("rawtypes")
	private List members;
	private String number;
	
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	@SuppressWarnings("rawtypes")
	public List getMembers() {
		return members;
	}
	@SuppressWarnings("rawtypes")
	public void setMembers(List members) {
		this.members = members;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
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
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public boolean isUsed() {
		return used;
	}
	public void setUsed(boolean used) {
		this.used = used;
	}
	
	
	
	@Override
	public String toString() {
		return "Form_tag [userName=" + userName + ", pass=" + pass + ", desc=" + desc + ", used=" + used + ", language="
				+ language + ", members=" + members + ", number=" + number + "]";
	}
	public String execute() {
		System.out.println(this);
		
		
		return "success";
	}
	
}
