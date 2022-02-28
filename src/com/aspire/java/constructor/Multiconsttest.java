package com.aspire.java.constructor;

public class Multiconsttest {
public static void main(String[] args) {
	MultiConstruct Object=new MultiConstruct();
	Object.method1();
	MultiConstruct Object1=new MultiConstruct(50,100);
	Object1.method1();
	MultiConstruct Object2=new MultiConstruct(10,50,100);
	Object2.method1();
}
}
