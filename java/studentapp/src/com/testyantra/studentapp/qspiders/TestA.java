package com.testyantra.studentapp.qspiders;
//import com.testyantra.studentapp.jspiders.Angular;
//import com.testyantra.studentapp.jspiders.React;

import com.testyantra.studentapp.jspiders.*;

public class TestA {
	
		public static void main(String[] args) {
		QTP q = new QTP();
		q.teachQtp();
		
		Salenium s = new Salenium();
		s.teachSalenium();
		
//		com.testyantra.studentapp.jspiders.Angular a = new com.testyantra.studentapp.jspiders.Angular();
//		
//		com.testyantra.studentapp.jspiders.Angular b = new com.testyantra.studentapp.jspiders.Angular();
	
		Angular a = new Angular();
		a.teachAngular();
		
		React r = new React();
		r.teachReact();
		
	}
	
}
