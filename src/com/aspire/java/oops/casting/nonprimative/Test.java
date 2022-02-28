package com.aspire.java.oops.casting.nonprimative;

public class Test {
	
	public static void main(String[] args) {
		System.out.println("**********parent class*********");
		Parent p=new Parent();
		p.House();
		p.Jwellery();
		p.money();
		System.out.println("**********Child class*********");
		Child c=new Child();
		c.House();
		c.money();
		c.Car();
		c.Jwellery();
		System.out.println("**********Casting class*********");
		Parent pc=new Child();
		pc.House();      //new implmentation of child class we give to parent class by using up casting 
		pc.Jwellery();
		pc.money();        //new implmentation of child class we give to parent class by using up casting 
	
	
	}

}
