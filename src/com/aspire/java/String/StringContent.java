package com.aspire.java.String;

public class StringContent{
	
	public static void main(String[] args) {
		String s1="Shubham Parshuram Bhambere";
		String s2="shubham";
		String s3="                     ";
		String s4="";
		String s5="re";
		String s6="Shub";
		char a=s1.charAt(6);
		
         System.out.println(a); 
		
		System.out.println(s1.isEmpty());      //false
		System.out.println(s4.isEmpty());     //true
		System.out.println(s3.isEmpty());      //false
		System.out.println(s1.startsWith(s6));      //true
		System.out.println(s1.endsWith(s5));         //true
		System.out.println(s1.charAt(2));
	    System.out.println(s1.contains(s2));             //false
	    System.out.println(s1.contains(s5));          //true
	    System.out.println(s1.startsWith("Shub"));     //true
	    System.out.println(s1.endsWith("ere"));            //true
	    System.out.println(s1.indexOf('a'));       //first match index number
	    System.out.println(s1.lastIndexOf('a'));     //last match index number
	    System.out.println(s1.toUpperCase().contains(s2.toUpperCase()));    //true
	    System.out.println(s2.contains(s6.toLowerCase()));         //true
	     
	    
	    
	    
        
		
		
		
		
		
		
	}
	
	
	

}
