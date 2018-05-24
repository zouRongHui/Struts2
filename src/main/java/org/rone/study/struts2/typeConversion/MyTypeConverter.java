package org.rone.study.struts2.typeConversion;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import javax.servlet.ServletContext;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.util.StrutsTypeConverter;

public class MyTypeConverter extends StrutsTypeConverter {
	private DateFormat dateFormat;
	private DateFormat getDateFormat() {
		if(dateFormat == null) {
			//获取在web.xml中配置的初始化参数
			ServletContext sc = ServletActionContext.getServletContext();
			String MyPattern = sc.getInitParameter("MyPattern");
			dateFormat = new SimpleDateFormat(MyPattern);
		}
		return dateFormat;
	}
	@SuppressWarnings("rawtypes")
	@Override
	public Object convertFromString(Map context, String[] values, Class toClass) {
		if(toClass == Date.class) {
			if (values != null && values.length > 0) {
				String value = values[0];
				try {
					return getDateFormat().parseObject(value);
				} catch (ParseException e) {
					e.printStackTrace();
				}
			}
		}
		return null;
	}
	@SuppressWarnings("rawtypes")
	@Override
	public String convertToString(Map context, Object o) {
		if (o instanceof Date) {
			Date date = (Date)o;
			return getDateFormat().format(date);
		}
		return null;
	}
}
