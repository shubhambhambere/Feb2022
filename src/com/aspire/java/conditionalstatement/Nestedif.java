package com.aspire.java.conditionalstatement;

public class Nestedif {public static void main(String[] args) {
	int age=22;
	String gender="female";
	if(age>=18)
	{
		
	System.out.println("Its a legal voter");
	
	   if(gender=="male"&&age<21)
	   {
		   
		   System.out.println("Not Legal age for marriage");
	   }
	
	   else
	   {
		   System.out.println("Its a legal age for marriage");
		   
		   
	   }
	   if(age>40)
	   {System.out.println("Person not eligible for gov job");
		   
		   
	   }
	   
	   else
	   {System.out.println("person is eligible for gov job");
		   
	   }
		   
		   
		   
	}
	else
	{
		System.out.println("Its a not legal voter");
	}
		
}

}
