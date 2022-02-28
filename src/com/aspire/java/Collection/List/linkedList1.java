package com.aspire.java.Collection.List;
// Default Capacity not 
// Each data Entry having new value Assign 
// Data Structure-Linear
// best choice-During manipulation or data & delete
//Worst choice-During data getting or retrieval

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class linkedList1 {

	public static void main(String[] args) {
		
   LinkedList ll = new LinkedList();

	ll.add("Shubham");
	ll.add(1234567890);
	ll.add(98.20f);
	ll.add(null);
	ll.add(98.20f);
	ll.add(null);
	System.out.println(ll);
	ll.remove(3);
	System.out.println(ll);
	ll.add(50);
	System.out.println(ll);
	ll.set(5, 60);
	System.out.println(ll);
	int a=40;
	System.out.println(a+(int)ll.get(5));    //object cast into int
	System.out.println(ll);
	
	
	// To get data Retrieval we use (for loop,For Each loop,CURSER-(iterator,ListIterator,Enumeration))
	System.out.println("For Loop Forward:-");
	for(int i=0;i<=ll.size()-1;i++)                //For loop Forward
	{
		System.out.print(ll.get(i)+" ,");
		
	}
	System.out.println();
	System.out.println("For loop Reverse:-");
	                                
	for (int i=ll.size()-1;i>=0;i--)               //For loop Reverse
	{
	System.out.print(ll.get(i)+" ,");	
		
	}
	
	System.out.println();
	
	System.out.println("For Each Loop:-");    //For Each loop
     	
	for(Object b:ll)
	{
		System.out.print(b+" ,");
	}
	
	
	
	System.out.println();
	System.out.println("Itretor:-");            //Iterator
	
	Iterator lli = ll.iterator();
	while(lli.hasNext())
	{
		System.out.print(lli.next()+" ,");
	}
	
	System.out.println();
	System.out.println("List Iterator Forward:-");
    
	ListIterator litr = ll.listIterator();             //list iTerator forward
	while(litr.hasNext())
	{
	System.out.print(litr.next()+" ,");	
	}
	
	System.out.println();
	System.out.println("List Iterator backward:-");         //list iterator backward
	
	ListIterator litrrev = ll.listIterator(ll.size());
	while(litrrev.hasPrevious())
	{
		System.out.print(litrrev.previous()+" ,");
	}
	
	System.out.println();
	System.out.println("demo :-");
	                 ListIterator lit = ll.listIterator(ll.size()-3);
	
	                 while(lit.hasNext())
	                 {
	                       System.out.print(lit.next()+" ,");
	                 }
	                 
	                 
	
		
	}
	
   
		
		
	}
	
	
