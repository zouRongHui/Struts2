package org.rone.study.struts2.typeConversion;

import java.util.Collection;

import com.opensymphony.xwork2.ActionSupport;

public class CollectionConversionAction extends ActionSupport {
	private Collection<ConversionModel> model;
	
	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		return "CollectionConversionAction [model=" + model + "]";
	}

	public Collection<ConversionModel> getModel() {
		return model;
	}

	public void setModel(Collection<ConversionModel> model) {
		this.model = model;
	}
	
	@Override
	public String execute() throws Exception {
		System.out.println(model);
		return "success";
	}
	
}
