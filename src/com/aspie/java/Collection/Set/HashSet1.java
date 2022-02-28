package com.aspie.java.Collection.Set;
//here order of insertion not maintain 
//here no duplicates allowed
//null value allowed only one time
//
import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {
public static void main(String[] args) {
	

      HashSet hs = new HashSet();
      hs.add("shubham");
      hs.add(123457896);
      hs.add(98.20f);
      hs.add(98.20f);
      hs.add(null);
      hs.add(null);
      hs.add(60);
      System.out.println(hs);
      hs.remove("null");
      System.out.println(hs);
      hs.remove("shubham");
      System.out.println(hs);
      
    //  System.out.println("For loop:-");           //   here not get methods available 
     // for (int i=0;i<hs.size();i++)
      
   // 	  System.out.println(hs.get);
   //   }
      
      
      System.out.println("For Each loop:-");          //For Each loop
      for (Object b:hs)
      {
    	  System.out.print(b+" ,");
    	  
      }
      
      System.out.println();
      System.out.println("Iterator:-");         //Iterator
      
     Iterator itr = hs.iterator();
      
      while(itr.hasNext())
      {
    	  
    	  System.out.print(itr.next()+" ,"); 
      }
      
      
      
}	
}
