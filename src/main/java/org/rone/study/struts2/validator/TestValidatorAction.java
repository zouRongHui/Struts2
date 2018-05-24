package org.rone.study.struts2.validator;

import com.opensymphony.xwork2.ActionSupport;

public class TestValidatorAction extends ActionSupport {

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRepeatPassword() {
		return repeatPassword;
	}

	public void setRepeatPassword(String repeatPassword) {
		this.repeatPassword = repeatPassword;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int age;
	private String password;
	private String repeatPassword;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String execute() throws Exception {
		System.out.println(age);
		return "success";
	}

}
