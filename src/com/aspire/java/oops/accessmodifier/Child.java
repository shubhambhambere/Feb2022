package com.aspire.java.oops.accessmodifier;

public class Child extends Parent{


	public void m5()
	{
		System.out.println("public from child class");
	}
	
	protected void m6()
	{
		System.out.println("protected from child class");
	}
	 void m7()
	 {
			System.out.println("Default from child class");
	 }
	
	 private void m8()
	 {
			System.out.println("private from child class");
	 }
	 
	 public static void main(String[] args) {
		Child c=new Child();
	c.m1();
	c.m2();
	c.m3();
	c.m5();
	c.m6();
	c.m7();
	c.m8();
	
	Parent p=new Parent();
	p.m1();
	p.m2();
	p.m3();
	
	Sample s=new Sample ();
	s.m9();
	s.m10();
	s.m11();
	
	
	}
	 
}
