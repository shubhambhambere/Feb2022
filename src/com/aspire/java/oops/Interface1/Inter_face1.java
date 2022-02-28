package com.aspire.java.oops.Interface1;
//Interface In this The total incomplete methods 100% abstract methods 
//compiler not provide Default and user defined Constructor
//Due to absence of constructor all data members & variables by default declare static



//object creation not possible For object creation We need implementaion class
//All methods are abstract methods 
public interface Inter_face1 {

	
	int a=20;    //------->Static variable Bcz(costructor Not Present)
	public void m1();
	public static void m2()   //Decleration      //static----->Complete method=Defination+decleration
	{    //Defination
		System.out.println("Running from interface1 static method m2");
	}
	public void m3();
	public void m4();

	
}
