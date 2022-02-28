package com.aspire.java.oops.Interface1;

public class MobileCallTest {
	public static void main(String[] args) {
		MobileTest mt=new MobileTest();
	mt.Camera();
	mt.Display();
	mt.Os();
	mt.RAM();         //Unique method call from mobile test class
	mt.SelfieCamera();

	System.out.println("*******************");
	Samsung s=new Samsung();
	s.Camera();
	s.Display();
	s.Os();
	s.Rom();          //Unique method call from Samsung class
	s.SelfieCamera();

	
	}
	
	

}
