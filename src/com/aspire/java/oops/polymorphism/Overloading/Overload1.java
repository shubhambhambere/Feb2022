package com.aspire.java.oops.polymorphism.Overloading;
//Overloading same Method name with diff Parameters,Diff datatypes,sequence of parameters
public class Overload1 {
	int a=10;
	public void addition()
	{
		System.out.println("value with no parameters "+a);
	}
	
	public void addition(int a)
	{
		int z=a+a;
		System.out.println("Value with single int parameters "+z);
	}
	public void addition(int b,int c)
	{
		int y=a+b+c;
		System.out.println("Value with double int parameters "+y);
	}
	public void addition(int d,float e)
	{
		double x=a+d+e;
		System.out.println("Value with sigle int & sigle float parameters "+x);
	}
	public void addition(float g,int f)
	{
		double u=a+g+f;
		System.out.println("Value with sigle int & sigle float parameters "+u);
	}
	public void addition(String s)
	{
		
		System.out.println("Value with single string "+s);
	}
	public void addition(int i,int j,int k)
	{
		int v=a+i+j+k;
		System.out.println("Value with Three int parameters "+v);
			
	}
	private void Shubhamm(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
		System.out.println("shubham");
	}
	private void Shubhamm()
	{
		System.out.println("shubham");
	}
	final void shubh()
	{
		System.out.println("shubham");
	}
	final void shubh(String b)
	{
		System.out.println("shubham");
	}

	public static void main(String[] args) {
		
		Overload1 ov=new Overload1();
		ov.Shubhamm();
		ov.Shubhamm(10, 20);
		
	}
}
