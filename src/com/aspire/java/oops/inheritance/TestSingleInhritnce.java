package com.aspire.java.oops.inheritance;

public class TestSingleInhritnce {
public static void main(String[] args) {
	System.out.println("all from Parent class");
	Parent p=new Parent();
	p.car();
	p.farm();
	p.money();
    Parent.banglow();
    System.out.println("all from Child Class");
    Child c=new Child();
    c.car();
    c.farm();
    c.money();
    c.iphone();
    Child.bike();
    Child.banglow();
}
}
