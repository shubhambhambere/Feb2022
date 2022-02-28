package com.aspire.java.String;

public class StringCompare {
public static void main(String[] args) {

	String s1="Aspire";
	String s2="ASPIRE";
	String s3="aspire";
	String s4="AspiRE";
	String s5=new String("Aspire");
	String s7=new String("Aspire");
	String s6="Aspire";
	
	System.out.println(s1==s2);             //false 
	System.out.println(s1==s6);             //true
	System.out.println(s1.equals(s6));      //true
	System.out.println(s1.equals(s5));     //true
	System.out.println(s1.equalsIgnoreCase(s2));   //true
	System.out.println(s5==s7);                   //false
	System.out.println(s1.equalsIgnoreCase(s3));    //true
	System.out.println(s5.equals(s1));       //true
	System.out.println(s1==s5);          //false
	System.out.println(s1==s3);           //false
	System.out.println(s1.equalsIgnoreCase(s4));    //True
	
	
	
}
	
	
	
	
}
