package com.aspire.java.oops.polymorphism.Overriding;

public class OverRidingChild1 extends OverRidingParent1{

	public void Banglow()  //Decleration
	{
		//Defination
		
		System.out.println("Banglow=1 Child class");
	}
	public void money()
	{
		System.out.println("money=10000 Child class");
	}
	public void Farm()
	{
		System.out.println("Farm=1 Acres Child class");
	}
	public void Bike()
	{
		System.out.println("Bike=2 child class");
	}
	//final void daughterinlaw()
	//{
	//	System.out.println("Daughter in law from Parent class");
	//}
	
	public static void Jwellery()
	{
		System.out.println("Jwellery from Child class");
	}
	public void Addition(int a,int b)
	{
		int c=a+b;
		System.out.println("Addition From Child class "+c);
	}
	
	
}
