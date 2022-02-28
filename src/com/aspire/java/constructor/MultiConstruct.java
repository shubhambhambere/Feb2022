package com.aspire.java.constructor;

public class MultiConstruct {

	int a;
	int b;
	

	MultiConstruct()
	{
		a=10;
		b=20;
		
	}
	MultiConstruct(int c,int d)
	{
		a=c;
		b=d;
		
	}
	
	MultiConstruct(int c,int d,int e)
	{
		a=c+d;
	    b=e;
		
	}
	public  void method1()
	{
		System.out.println(a);
		System.out.println(b);
	}
	
}
