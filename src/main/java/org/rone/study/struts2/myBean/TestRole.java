package org.rone.study.struts2.myBean;

public class TestRole {
	private String roleID;
	private String roleName;
	
	public TestRole() {
		// TODO Auto-generated constructor stub
	}
	
	public TestRole(String roleID, String roleName) {
		super();
		this.roleID = roleID;
		this.roleName = roleName;
	}
	public String getRoleID() {
		return roleID;
	}
	public void setRoleID(String roleID) {
		this.roleID = roleID;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
	
	
}
