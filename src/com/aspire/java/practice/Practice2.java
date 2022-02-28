package com.aspire.java.practice;

public class Practice2 extends Practice1
{

//	static int a=100;
//	int b=200;
	public static void m2()
	{   int a=1000;
		int c;
		c=a+Practice1.a+Practice2.a;
		System.out.println(c);		
	}
	
	 public void m3()
	{
	   	int c;
	   	c=a+b;
	   	System.out.println(c);
	   	super.m1();
	   	this.m2();
	}
	
	public static void main(String[] args)
	{	Practice2 p1=new Practice2();
		p1.m1();
		p1.m2();
		p1.m3();
		
	}
	
	
}
