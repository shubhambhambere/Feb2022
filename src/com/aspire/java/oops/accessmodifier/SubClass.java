package com.aspire.java.oops.accessmodifier;

public class SubClass extends Superclass {

	public void a5()
	{
		System.out.println("public from sub class");
	}
	protected void a6()
	{
		System.out.println("protected from sub class");
	}
	void a7()
	{
		System.out.println("Default from sub class");
	}

	private void a8 ()
	{
		System.out.println("private from sub class");
	}

	
public static void main(String[] args) {
	Superclass sc=new Superclass();
	sc.a1();
	sc.a2();
	sc.a3();

	
	SubClass sub=new SubClass();
	sub.a1();
	sub.a2();
	sub.a3();
	sub.a5();
	sub.a6();
	sub.a8();
	sub.a7();
	
	TestClass tc=new TestClass();
	
	tc.a9();
	tc.a10();
	tc.a11();
	
	
}
	
}
