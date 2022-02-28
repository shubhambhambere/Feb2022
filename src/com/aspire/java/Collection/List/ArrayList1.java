package com.aspire.java.Collection.List;
//Array list is Child Implements class Of List Interface Class
//Array List iN which Duplicates Allowed,Any null value Allowed,Order of Insertion maintain
//Array list default value 10
//After Default value it increase (current Value *3/2 +1) eg:-current value*1.5 +1
//Array List in Which For Data Retrieval We Use (for loop,For Each loop,CURSER-(iterator,ListIterator))
//Data Structure-Reusable
//Storage Type-Index
//Best Choice-For Data Retrieval
//Worst Choice-for manipulation (data Delete)
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList1 {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
	
		al.add("Shubham");
		al.add(1234567890);
		al.add(98.20f);
		al.add(null);
		al.add(98.20f);
		al.add(null);
		System.out.println(al);
		al.remove(3);
		al.add(60);
		System.out.println(al);
		al.set(5, 70);
		System.out.println(al);
		int a=30;
		System.out.println(a+(int)al.get(5));
		System.out.println(al);
			
	// To get data Retrieval we use (for loop,For Each loop,CURSER-(iterator,ListIterator,Enumeration))
		
		System.out.println("For Loop:-");
		
		for(int i=0;i<al.size();i++)
		{
			System.out.print(al.get(i)+" ,");
		}
		System.out.println();
		System.out.println("For Each loop:-");
		
		for (Object b:al)
		{
			System.out.print(b+" ,");
		}
		System.out.println();
		System.out.println("Itreator:-");
		     //     int x = al.size();             //Similar
		Iterator itr = al.iterator();            //Only Forward by using iterator
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ,");
		}
		System.out.println();
        System.out.println("List iterator Forward:-");
           ListIterator litr = al.listIterator();         //forward By Using list iterator
           
        while(litr.hasNext())
		{
			System.out.print(litr.next()+" ,");
		}
        
        System.out.println();
        System.out.println("List iterator Backward:-");
        
        ListIterator litrrev = al.listIterator(al.size());  // BackWard By Using list iterator
        while(litrrev.hasPrevious())
        {
        	System.out.print(litrrev.previous()+" ,");
        }
        
		
		
	}
	
}
