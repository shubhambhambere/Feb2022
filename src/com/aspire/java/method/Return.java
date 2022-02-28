package com.aspire.java.method;

public class Return {
public static void main(String[] args) {
     
      System.out.println(method());
//	String f=method2();
//	System.out.println(f);
	System.out.println(method2());
	Return r=new Return ();
	System.out.println(r.m1());
}

public static int method()
{
	int A=10;
	int B=20;
	int c=A+B;
	return c;
}
public static String method2()
{
	String g=("Aspire institute");
	return g;	
}
public int  m1()
{
	int a=10;
	int b=50;
	int c=a+b;
    return c;
}

}
