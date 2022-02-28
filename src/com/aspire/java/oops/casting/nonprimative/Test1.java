package com.aspire.java.oops.casting.nonprimative;

public class Test1 {
	
public static void main(String[] args) {
	
	Parent1 p1=new Parent1();
	p1.m1();
	p1.m2();
	
	Child1 c1=new Child1();
	c1.m1();          //Overriding 
	c1.m2();          //Overriding 
	c1.m3();
	
Parent1 p2=new	Child1();
	p2.m1();
	p2.m2();
	
}

}
