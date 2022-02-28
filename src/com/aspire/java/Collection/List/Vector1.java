package com.aspire.java.Collection.List;
// All Same as Array List only 
//Data Structure Doubly 
//incremental capacity=current capacity*2
//It is Legacy Class

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vector1 {

public static void main(String[] args) {
	
	         Vector v = new Vector();
	         
	v.add("Shubham");
	v.add(1234567890);
	v.add(98.20f);
	v.add(null);
	v.add(98.20f);
	v.add(null);
	System.out.println(v);
	v.remove(3);
	v.add(60);
	
	System.out.println(v);
	v.set(5, 70);
	System.out.println(v);
	int a=30;
	System.out.println(a+(int)v.get(5));      //object cast into int
	System.out.println(v);
		
// To get data Retrieval we use (for loop,For Each loop,CURSER-(iterator,ListIterator,Enumeration))
	
	System.out.println("For Loop:-");
	
	for(int i=0;i<v.size();i++)
	{
		System.out.print(v.get(i)+" ,");
	}
	System.out.println();
	System.out.println("For Each loop:-");
	
	for (Object b:v)
	{
		System.out.print(b+" ,");
	}
	System.out.println();
	System.out.println("Itreator:-");
	     //     int x = al.size();             //Similar
	Iterator itr = v.iterator();            //Only Forward by using iterator
	while(itr.hasNext())
	{
		System.out.print(itr.next()+" ,");
	}
	System.out.println();
    System.out.println("List iterator Forward:-");
       ListIterator litr = v.listIterator();         //forward By Using list iterator
       
    while(litr.hasNext())
	{
		System.out.print(litr.next()+" ,");
	}
    
    System.out.println();
    System.out.println("List iterator Backward:-");
    
    ListIterator litrrev = v.listIterator(v.size());  // BackWard By Using list iterator
    while(litrrev.hasPrevious())
    {
    	System.out.print(litrrev.previous()+" ,");
    }
    System.out.println();
    System.out.println("ENUMERATION:-");
    Enumeration en = v.elements();                 //  ENUMERATOR
            while(en.hasMoreElements())
            {
            	System.out.print(en.nextElement()+" ,");
            }
	

}
	
	
}
