package com.aspire.java.oops.thissuper;

public class Child extends Parent {
int a=100;       //global variable
int b=200;       //global variable
int j=300;      //global variable 


public void shubham()
{
	System.out.println("shubham");
}

public void addition()
{
	int a=10;    //local variable 
	int b=20;   //local variable 
	 int k=30;   //local variable 
	 int z=this.a+super.a;       //Addition of two global variables(Super&This)
	 System.out.println("a= "+a);
	 System.out.println("b= "+b);
	 System.out.println("global from parent class a= "+super.a);
	 System.out.println("Global From parent class b= "+super.b);
	 super.m1();
	 System.out.println("Global From same class b= "+this.b);
	 System.out.println("Global From same class a= "+this.a);
	 System.out.println("Global From parent class i= "+i);
	 System.out.println("Addition of Gloabl same and diff class"+z);
this.shubham();	 
	 System.out.println("Global From same class j= "+j);
	 	 System.out.println("local From same class k= "+k);
	 
	 
	 
}
}
