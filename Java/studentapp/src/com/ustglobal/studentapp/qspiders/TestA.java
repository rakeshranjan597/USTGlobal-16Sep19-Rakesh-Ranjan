package com.ustglobal.studentapp.qspiders;

import com.ustglobal.studentapp.jspiders.Angular;
import com.ustglobal.studentapp.jspiders.React;

public class TestA {
	public static void main(String[] args) {
		QTP q = new QTP();
		q.teachQtp();
		
		Selenium se = new Selenium();
		se.teachSelenium();
		
		Angular a = new Angular();
		a.teachAngular();
		
		React r = new React();
		r.teachReact();
		
		// we can also use fullyquallified class name
		
	}
}
