package org.rone.study.struts2.myAction;

import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;

import org.rone.study.struts2.myBean.Employee;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class EmployeeAction implements RequestAware, ModelDriven<Employee>, Preparable{
	//用来接收CRUD操作时传递的参数
	private Employee employee;
	private String employeeID;
	
	public String update() {
		dao.updateEmployee(employee);
		return "success";
	}
	public void prepareUpdate() { employee = new Employee();}
	public String edit() {
		return "edit";
	}
	public void prepareEdit() {employee = dao.getEmployee(employeeID);}
	public String add() {
		dao.addEmployee(employee);
		return "success";
	}
	public void prepareAdd() {employee = new Employee();}
	@Override
	public Employee getModel() {
		return employee;
	}
	@Override
	public void prepare() throws Exception {
	}
	
	private Dao dao = new Dao();
	private Map<String, Object> requestMap;

	public String show(){
		requestMap.put("employees", dao.getEmployees());
		return "show";
	}
	
	public String delete() {
		dao.deleteEmployee(employeeID);
		return "success";
	}
	
	
	

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}
	
	
	@Override
	public void setRequest(Map<String, Object> request) {
		this.requestMap = request;
	}

	

	
	
}
