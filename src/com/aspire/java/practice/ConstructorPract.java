package com.aspire.java.practice;

public class ConstructorPract
{

	static int a;
	float b;
	double c;
	boolean d;
	
	
	ConstructorPract()
	{
	 a=10;
	 b=50.50f;
	 c=50.560532;
	 d=true;
	 
	 
	}
	
	
	public static void main(String[] args)
	{
		
		ConstructorPract s=new ConstructorPract();
		System.out.println(ConstructorPract.a);
		System.out.println(s.b);
		System.out.println(s.c);
		System.out.println(s.d);
		
	}
	
	
}
