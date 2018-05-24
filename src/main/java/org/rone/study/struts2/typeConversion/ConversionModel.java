package org.rone.study.struts2.typeConversion;

import java.util.Date;

public class ConversionModel {
	private int age;
	private Date birth;
	private Model2 model2;
	
	public Model2 getModel2() {
		return model2;
	}

	public void setModel2(Model2 model2) {
		this.model2 = model2;
	}

	public Date getBirth() {
		return birth;
	}
	
	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "ConversionModel [age=" + age + ", birth=" + birth + ", model2=" + model2 + "]";
	}

	
	
	
	
}
