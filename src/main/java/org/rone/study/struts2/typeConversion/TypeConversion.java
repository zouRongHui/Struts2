package org.rone.study.struts2.typeConversion;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class TypeConversion extends ActionSupport implements ModelDriven<ConversionModel> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ConversionModel model;
	
	public String execute() {
		System.out.println("model is " + model);
		return "success";
	}

	@Override
	public ConversionModel getModel() {
		model = new ConversionModel();
		return model;
	}
}
