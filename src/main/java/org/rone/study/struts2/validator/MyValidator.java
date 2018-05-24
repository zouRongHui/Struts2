package org.rone.study.struts2.validator;

import com.opensymphony.xwork2.validator.ValidationException;
import com.opensymphony.xwork2.validator.validators.FieldValidatorSupport;

public class MyValidator extends FieldValidatorSupport {
	@Override
	public void validate(Object object) throws ValidationException {
		//获取字段值
		String fieldName = getFieldName();
        Object value = this.getFieldValue(fieldName, object);
		//验证过程
		//验证失败的处理
        if ((int)value > 18 || (int)value < 1) {
        	//添加错误消息
        	addFieldError(fieldName, object);
        }
	}
}
