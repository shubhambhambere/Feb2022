package com.aspire.java.conditionalstatement;
//marks 
public class Nastedif3 {
public static void main(String[] args) {
	String Name="shubham";
	int marks=51;
	if(Name=="shubham"&&marks>50)
	{
		System.out.println("passed in 10th with second class");
	      if(Name=="ayesha"&&marks>50)
	      {
	    	  System.out.println("passed in 10th with second class");
	      }
	      else
	      {
	    	  System.out.println("Not passed in 10th with second class");
	      }
		
	}
	else
	{
		System.out.println("fail in 10th");
	}
}
}
