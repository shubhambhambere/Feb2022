package com.aspire.java.oops.polymorphism.Overloading;

public class TestOverload1 {
	public static void main(String[]args)
	{
	Overload1 ol=new Overload1();
	ol.addition();
	ol.addition(10);
	ol.addition(20,30);
	ol.addition("shubham ayesha");
	ol.addition(10, 50);
	ol.addition(20, 50, 60);
	}

	public static void  main()
	{
		Overload1 ol=new Overload1();
		ol.addition(20);
		
	}
	
}

