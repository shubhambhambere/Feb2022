package com.aspire.java.String;
public class Sample {

	public static void main(String[] args) {
		
		String s="Admin";
		String s1="Aspire";    //constant string pool area
		String s2="Aspire";       //here duplicate object not allowed
		String s6=new String ("Aspire");
		String s3= new String("Aspire Institute"); 
		String s4=new String ("Aspire Institute");    // Non constant String pool Area
		String s5=new String ("aspire institute");     //here duplicate object allowed
		
		
		System.out.println(s1==s2);     //true
		System.out.println(s2==s3);     //false
		System.out.println(s3==s4);     //false        
		System.out.println(s4==s5);     //false          //== we are used to compare object
		System.out.println(s1==s3);     //false            
		System.out.println(s2==s4);     //false
		  
		System.out.println(s1.equals(s2));   //true
		System.out.println(s2.equals(s4));    //false
		System.out.println(s3.equals(s4));   //true        //equals we are used to compare values
		System.out.println(s4.equals(s5));    //false
		System.out.println(s.equals(s1));    //false
		System.out.println(s6.equals(s2));    //true
			
		
		
		
		
	}
}
