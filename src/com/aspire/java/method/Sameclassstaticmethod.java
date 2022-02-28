package com.aspire.java.method;

import com.aspire.java.diffpackmethod.Diffpackstaticmethod;

// static                     non static
// same class  1,2,3         same class  8,9
// diff class  4,5           diff class   10,11
// diff package   6,7        diff package  12,13
public class Sameclassstaticmethod {public static void main(String[] args) {
	System.out.println("Running from main method");
   method1(); //same class
   method2();  //same class
   method3(); //same class
   method2();  //same class
   //method name
   Diffclassstatic.method4(); // diff class
   Diffclassstatic.method5(); // diff class
   Diffclassstatic.method4(); // diff class
   //class name.method name
   Diffpackstaticmethod.method6();  //Diff Package
   Diffpackstaticmethod.method7();   //Diff Package
   Diffpackstaticmethod.method6();  //Diff Package
   
}
public static void method1()
{
	System.out.println("Running from method1 same class");
}
public static void method2()
{
	System.out.println("Running From method2 same class");
}
public static void method3()
{
	System.out.println("hrishkesh same class");
}

}
