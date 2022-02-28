package com.aspire.java.logicalprograms;

public class Combinationmulti {
public static void main(String[] args) {
	System.out.println(method1());
	Combinationmulti object=new Combinationmulti();
	System.out.println(object.method2(20,50));
	
}
public static String method1()
{
	String a=("divisible by 2 even numbers");
			return a;
}
public int method2(int b,int c)
{
	int d=c/b;
	return d;
}
}
