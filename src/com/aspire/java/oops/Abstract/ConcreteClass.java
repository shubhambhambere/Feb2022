package com.aspire.java.oops.Abstract;

public class ConcreteClass extends AbstractClass {


	public void Subtraction() {
     int d;
     d=b-a;
     System.out.println(d);
		
	}

		public void Multi() {
	int e;
	e=a*b;
	System.out.println(e);
		
	}

	
	public void div() {
		float f;
		f=b/a;
		System.out.println(f);
		
	}
	public static void main(String[]args)
	{
		ConcreteClass CC=new ConcreteClass();
		CC.Addition();   //Parent--->Concrete class
		CC.Subtraction();//Parent---> abstract class
		CC.Multi();      //Parent---> abstract class
		CC.div();        //Parent---> abstract class
		
		
	}

}
