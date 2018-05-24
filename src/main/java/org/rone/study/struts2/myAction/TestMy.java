package org.rone.study.struts2.myAction;

public class TestMy {
	private String pass;

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
	public String execute() {
		
		return "success";
	}
	
	public TestMy() {
		// TODO Auto-generated constructor stub
	}

	public TestMy(String pass) {
		super();
		this.pass = pass;
	}
	
	
}
