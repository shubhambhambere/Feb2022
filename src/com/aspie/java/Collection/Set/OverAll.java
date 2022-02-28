package com.aspie.java.Collection.Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.Vector;

public class OverAll {
	
	public static void main(String[] args) {
		
		int []a= {1,2,3,5,8,8,25,50};
		String [] s= {"shubham","Ayesha","kalpana","Ayat","Dhruva","shubham"};
		
	ArrayList al = new ArrayList();
		
	System.out.println("**************Arraylist***************");
		for(int i=0;i<a.length;i++)
		{
		    al.add(a[i]);
		   
		}
          for(String b:s)
		{
		  al.add(b);
		}
	   System.out.println(al);
		System.out.println();
		System.out.println("**************Vector***************");
		           Vector v = new Vector();
		
		for(int i=0;i<a.length;i++)
		{
			v.add(a[i]);
		}
		
		for(String b:s) 
	    {
		  v.add(b);
		
		}
		
		System.out.print(v);
		System.out.println();
		System.out.println("**************LinkedList***************");
		LinkedList ll = new LinkedList();
		
		for(int i=0;i<a.length;i++)
		{
			ll.add(a[i]);
		}
		
		for(String c:s)
		{
			ll.add(c);
		}
		
		System.out.print(ll);
		System.out.println();
		System.out.println("**************Hashset***************");
		HashSet hs = new HashSet();
		for(int i=0;i<a.length;i++)
		{
			hs.add(a[i]);
		}
		
		for(String b:s)
		{
			hs.add(b);
		}
		System.out.print(hs);
		System.out.println();
		System.out.println("**************LinkedHashset***************");
		
		LinkedHashSet lhs = new LinkedHashSet();
		       
	          	for(int i=0;i<a.length;i++)
	          	{
	          		lhs.add(a[i]);
	          	}
		
		        for(String b:s)
		        {
		           lhs.add(b);
		        }
		
		System.out.print(lhs);
		System.out.println();
		System.out.println("**************TreeSet***************");
		
	TreeSet ts = new	TreeSet();
		
		for(int i=0;i<a.length;i++)
		{
			ts.add(a[i]);
			
		}
		
//	     for(String b:s)
	//	{
//			ts.add(b);
	//	}
		System.out.print(ts);
		
		
		
		
		
	}
	

}
 