package com.aspire.java.oops.remaininheritance;

public class Testherarchical {
public static void main(String[] args) {
	
	Child1 c1=new Child1();
	System.out.println("*********Purchase mobile***********");
	c1.chrome();
	c1.flipcartUrl();
	c1.loginCredential();
	c1.shopppingMobile();
	
	Child2 c2=new Child2();
	System.out.println("*********Purchase Tv**********");
	c2.chrome();
	c2.flipcartUrl();
	c2.loginCredential();
	c2.shoppingTV();
	
	
	Child3 c3=new Child3();
	System.out.println("*******Purchase laptop********");
	c3.chrome();
	c3.flipcartUrl();
	c3.loginCredential();
	c3.Shoppinglaptop();
	
	
}
}
