package com.aspire.java.oops.accessmodifier;

public class Parent {

	public void m1()
	{
		System.out.println("public from parent class");
	}
	
	protected void m2()
	{
		System.out.println("protected from parent class");
	}
	void m3()
	{
		System.out.println("Default from parent class"); //default modifier
	}
	private void m4()
	{
		
		System.out.println("Private from parent class");
	}
	
}

