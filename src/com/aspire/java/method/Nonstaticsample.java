package com.aspire.java.method;
//import package location.classname;
import com.aspire.java.diffpackmethod.Diffpackstaticmethod;

// Non static sample 
public class Nonstaticsample {
public static void main(String[] args) {
	System.out.println("main method start");
	//classname objectname=new classname();
	Nonstaticsample SCobject=new Nonstaticsample();
	SCobject.method8();   //same class
	SCobject.method9();    //same class
	Nonstaticdiffclass DCobject=new Nonstaticdiffclass();
	DCobject.method10();  //Diff class
	DCobject.method11();  //Diff class
	Diffpackstaticmethod DPobject=new Diffpackstaticmethod();
	DPobject.method11();  //Diff Package
	DPobject.method12();  //Diff Package
	DPobject.method11();  //Diff Package
	System.out.println("Main Method End");
}
public void method8()
{
	System.out.println("I am from same class method8");
}
public void method9()
{
	System.out.println("I am from same class method9");
}
}
