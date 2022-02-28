package com.aspie.java.Collection.Acception;

public class TryCatchBlock {
public static void main(String[] args) {
	

	int a=10;
	int b=0;
    int div;
	
    int Sum;
	
	try
	{
		div=a/b;
		System.out.println(div);
	}
    
	catch(ArithmeticException e)
	{
		System.out.println("Do not div With zero");
	}
    
    Sum=a+b;
    System.out.println(Sum);
    
    String s="Shubham Parshuram bhambere";
    
   
    
    try
    {
    	System.out.println(s.charAt(40));
    }
    
    catch(StringIndexOutOfBoundsException e)
    {
    	System.out.println("do not enter the value of index in string out of length");
    }
    
    
    
    
    //shubham
    
	
}	
}
