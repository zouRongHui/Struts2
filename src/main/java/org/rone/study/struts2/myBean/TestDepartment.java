package org.rone.study.struts2.myBean;

public class TestDepartment {
	private String departmentID;
	private String departmentName;
	
	public TestDepartment() {
		// TODO Auto-generated constructor stub
	}
	
	public TestDepartment(String departmentID, String departmentName) {
		super();
		this.departmentID = departmentID;
		this.departmentName = departmentName;
	}

	public String getDepartmentID() {
		return departmentID;
	}

	public void setDepartmentID(String departmentID) {
		this.departmentID = departmentID;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	
}
