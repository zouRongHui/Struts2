package org.rone.study.struts2.myAction;

import java.util.Comparator;

public class testMyComparator implements Comparator<TestMy>{
	@Override
	public int compare(TestMy o1, TestMy o2) {
		return o1.getPass().compareTo(o2.getPass());
	}
}
