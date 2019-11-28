package com.testyantra.accessmodifier.pkg1;

import com.testyantra.accessmodifier.pkg2.Demo;

public class Sample extends Demo {
	public static void main(String[] args) {
		Demo d = new Demo();
		
		Sample s = new Sample();
		
		//default
//		System.out.println(s.b);
//		s.sub();
		//Protected
		System.out.println(s.c);
		s.mul();
		//public
		System.out.println(s.name);
//		s.div();
	} 
}
