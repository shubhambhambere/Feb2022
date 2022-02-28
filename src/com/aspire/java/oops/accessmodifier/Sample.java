package com.aspire.java.oops.accessmodifier;

public class Sample {
	
	public void m9()
	{
		System.out.println("public from diff class-sample");
	}
	
	protected void m10()
	{
		System.out.println("protected from diff class-sample");
	}
	 void m11()
	 {
			System.out.println("Default from diff class-sample");
	 }
	
	 private void m12()
	 {
			System.out.println("private from diff class-sample");
	 }
	 public static void main(String[] args) {
			Sample S=new Sample();
			S.m9();
			S.m10();
			S.m11();
			S.m12();
			
			Parent p=new Parent();
			p.m1();
			p.m2();
			p.m3();
			
			Child c=new Child();
			c.m1();
			c.m2();
			c.m3();
			c.m5();
			c.m6();
			c.m7();
			
	}
	

}
