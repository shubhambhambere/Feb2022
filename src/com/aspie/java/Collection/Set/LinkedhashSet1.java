package com.aspie.java.Collection.Set;
// linkedHashset in which the order on insertion maintain and no duplicate value allowed
// here we use only iterator courser for getting data and (for each loop also used)
//By using For loop We can't get the data bcz here no get method is present
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedhashSet1 {

	public static void main(String[] args) {
		


	LinkedHashSet lhs =new LinkedHashSet();
    lhs.add("shubham");
    lhs.add(123457896);
    lhs.add(98.20f);
    lhs.add(98.20f);
    lhs.add(null);
    lhs.add(null);
    lhs.add(60);
    System.out.println(  lhs);
    lhs.remove("null");
    System.out.println(  lhs);
    
    System.out.println(  lhs);
    
  //  System.out.println("For loop:-");           //   here not get methods available 
   // for (int i=0;i<hs.size();i++)
    
 // 	  System.out.println(hs.get);
 //   }
    
    
    System.out.println("For Each loop:-");          //For Each loop
    for (Object b:  lhs)
    {
  	  System.out.print(b+" ,");
  	  
    }
    
    System.out.println();
    System.out.println("Iterator:-");         //Iterator
    
   Iterator itr =   lhs.iterator();
    
    while(itr.hasNext())
    {
  	  
  	  System.out.print(itr.next()+" ,"); 
    }
    
    
	
	
	
	}
	
}
