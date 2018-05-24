package org.rone.study.struts2.myAction;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.rone.study.struts2.myBean.Employee;
import org.rone.study.struts2.myBean.MyUtil;
import org.rone.study.struts2.myBean.TestDepartment;
import org.rone.study.struts2.myBean.TestRole;

public class Dao {
	
	public List<TestDepartment> getDepartments(){
		List<TestDepartment> lists = new ArrayList<TestDepartment>();
		lists.add(new TestDepartment("1", "培训部"));
		lists.add(new TestDepartment("2", "人事部"));
		lists.add(new TestDepartment("3", "市场部"));
		lists.add(new TestDepartment("4", "财务部"));
		return lists;
	}
	
	public List<TestRole> getRoles() {
		List<TestRole> lists = new ArrayList<TestRole>();
		lists.add(new TestRole("1", "Employee"));
		lists.add(new TestRole("2", "Admin"));
		lists.add(new TestRole("3", "Teacher"));
		return lists;
	}
	
	//CRUD
	private static Map<String, Employee> employees = new LinkedHashMap<String, Employee>();
	
	static{
		employees.put("1001", new Employee("1001","rone","mone"));
		employees.put("1002", new Employee("1002","rone1","mone1"));
		employees.put("1003", new Employee("1003","rone2","mone2"));
		employees.put("1004", new Employee("1004","rone3","mone3"));
		employees.put("1005", new Employee("1005","rone4","mone4"));
	}
	
	public List<Employee> getEmployees() {
		return new ArrayList<>(employees.values());
	}
	
	public void addEmployee(Employee employee){
		employee.setEmployeeID(MyUtil.getNumber(4));
		employees.put(employee.getEmployeeID(), employee);
		System.out.println("Dao:addEmployee the "+employee.toString());
	}
	
	public void deleteEmployee(String employeeID) {
		employees.remove(employeeID);
		System.out.println("Dao:deleteEmployee the ID is "+employeeID);
	}
	
	public void updateEmployee(Employee employee) {
		System.out.println("Dao:updateEmployee the "+employee.toString());
		employees.put(employee.getEmployeeID(), employee);
	}
	
	public Employee getEmployee(String employeeID) {
		System.out.println("Dao:getEmployee the ID is "+employeeID);
		return employees.get(employeeID);
	}
}
