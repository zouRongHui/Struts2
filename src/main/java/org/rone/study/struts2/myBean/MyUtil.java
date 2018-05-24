package org.rone.study.struts2.myBean;

import java.util.Random;

public class MyUtil {
	public static String getNumber(Integer length) {
		String str = "";
		
		StringBuffer buffer = new StringBuffer("1234567890qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM");
		StringBuffer buffer2 = new StringBuffer();
		Random random = new Random();
		int bufferLength = buffer.length();
		for (int i = 0; i < length; i++) {
			buffer2.append(buffer.charAt(random.nextInt(bufferLength)));
		}
		str = buffer2.toString();
		
		return str;
	}
}
