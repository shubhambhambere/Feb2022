package com.aspire.java.oops.Abstract;

abstract public class AbstractClass {
int a=10;
int b=20;
	public  void Addition()   //Decleration------>concrete method/class,complete Method
	{
		//Defination & implementation
		int c;
        c=a+b;		
		
		System.out.println("Addition ="+c);
	}
  abstract	public void Subtraction() ;    //decleration,Incomplete Method  
 abstract public void Multi();         
 abstract public void div();
 
	
	
	
	
	
}
