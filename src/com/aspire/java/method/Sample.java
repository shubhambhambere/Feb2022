package com.aspire.java.method;
//in a same class call different methods in main method
public class Sample {
public static void main(String[] args) {
	System.out.println("i am from main method");
	addition();
	substraction();
	addition();
}
public static void addition()
{
	System.out.println("i am from addition method");
	
}
public static void substraction()
{
	System.out.println("i am from substraction method");
}


}
