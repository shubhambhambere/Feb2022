package com.aspie.java.Collection.Map;
//Key=Unique    Value=Duplicate
//Map=Key+Value
//if we want Both Unique and Duplicate then we used hashmap 
import java.util.HashMap;

public class HashMap1 {

	public static void main(String[] args) {
		
		
		              HashMap hm = new HashMap();
		              //     (Key=unique,Value=Duplicate)
		              hm.put(1, "Shubham");
		              hm.put(2, "ayesha");
		              hm.put(3, "Shubham");
		              hm.put(4,"santosh");
		              hm.put(5,"Rutuja");
		              hm.put(5,"karan");
		              System.out.println(hm);
		              hm.remove(5);
		              System.out.println(hm);
		              System.out.println(hm.containsKey(3));
		              System.out.println(hm.containsValue("Shubham"));
	                  System.out.println(hm.containsValue("Ayesha"));
		              System.out.println(hm.isEmpty());
		              
		              
	                	
	                	
	                	
	                	
	                	
	}
	
	
	
}
