package com.testyantra.collectionframework.list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class stackkk {
	
	public static  void main(String[] args) {
		
		Stack li = new Stack();
		li.add(12);
		li.add(12.25);
		li.add("vijay");
		li.add(true);
		li.add(null);
		
		System.out.println("========using for loop=====");
		for(int i = 0; i< li.size() ; i++) {
			System.out.println(li.get(i));
			
		}
		System.out.println("========using for each========");
		for(Object object : li) {
			System.out.println(object);
		}
		System.out.println("using iterator======");
		Iterator it = li.iterator();
		while(it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
		}
		
		System.out.println("========using list operator forward========");
		ListIterator lt = li.listIterator();
		while(lt.hasNext()) {
			Object o = lt.next();
			System.out.println(o);
		
		}
		
		System.out.println("========LIst iterator backward=========");
		while(lt.hasPrevious()) {
			Object o = lt.previous();
			System.out.println(o);
		}
		
		}
		

}
