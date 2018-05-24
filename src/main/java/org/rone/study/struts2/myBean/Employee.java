package org.rone.study.struts2.myBean;

public class Employee {
	@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + ", employeeFirstName=" + employeeFirstName + ", employeeLastName="
				+ employeeLastName + "]";
	}
	private String employeeID;
	private String employeeFirstName;
	private String employeeLastName;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(String employeeID, String employeeFirstName, String employeeLastName) {
		super();
		this.employeeID = employeeID;
		this.employeeFirstName = employeeFirstName;
		this.employeeLastName = employeeLastName;
	}
	public String getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}
	public String getEmployeeFirstName() {
		return employeeFirstName;
	}
	public void setEmployeeFirstName(String employeeFirstName) {
		this.employeeFirstName = employeeFirstName;
	}
	public String getEmployeeLastName() {
		return employeeLastName;
	}
	public void setEmployeeLastName(String employeeLastName) {
		this.employeeLastName = employeeLastName;
	}
	
}
