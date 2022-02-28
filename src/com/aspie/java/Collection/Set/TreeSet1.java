package com.aspie.java.Collection.Set;

import java.util.Iterator;
import java.util.TreeSet;

// thi sset is used only for Same type of data (homogeneous)
public class TreeSet1 {
	public static void main(String[] args) {
		
		TreeSet ts = new TreeSet  ();
		ts.add(20);
	   // ts.add("shubha");  //in treeset only same type of data allowed thats why here java.lang.ClassCastException this error occurred
		ts.add(50);
		ts.add(60);
		ts.add(70);
		ts.add(90);
		System.out.println(ts);
		 
		System.out.println("for Each loop:-");
		for(Object b:ts)
		{
			System.out.print(b+" ,");
		}
		
		System.out.println();
		System.out.println("Iterator:-");
		
		Iterator itr = ts.iterator();
		
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ,");
		}
		
		
		
		
		
	}
}
